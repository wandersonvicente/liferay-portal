/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.chat.service.impl;

import com.liferay.chat.internal.jabber.JabberUtil;
import com.liferay.chat.model.Entry;
import com.liferay.chat.model.EntryConstants;
import com.liferay.chat.model.Status;
import com.liferay.chat.service.base.StatusLocalServiceBaseImpl;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 * @author Tibor Lipusz
 */
@Component(
	property = "model.class.name=com.liferay.chat.model.Status",
	service = AopService.class
)
public class StatusLocalServiceImpl extends StatusLocalServiceBaseImpl {

	@Override
	public List<Object[]> getAllStatuses(
		long companyId, long userId, long modifiedDate, int start, int end) {

		return statusFinder.findByModifiedDate(
			companyId, userId, modifiedDate, start, end);
	}

	@Override
	public List<Object[]> getGroupStatuses(
		long userId, long modifiedDate, String[] groupNames, int start,
		int end) {

		return statusFinder.findByUsersGroups(
			userId, modifiedDate, groupNames, start, end);
	}

	@Override
	public List<Object[]> getSocialStatuses(
		long userId, int type, long modifiedDate, int start, int end) {

		return getSocialStatuses(
			userId, new int[] {type}, modifiedDate, start, end);
	}

	@Override
	public List<Object[]> getSocialStatuses(
		long userId, int[] types, long modifiedDate, int start, int end) {

		return statusFinder.findBySocialRelationTypes(
			userId, types, modifiedDate, start, end);
	}

	@Override
	public Status getUserStatus(long userId) {
		Status status = statusPersistence.fetchByUserId(userId);

		if (status == null) {
			status = statusLocalService.updateStatus(
				userId, System.currentTimeMillis(), 1, 1, StringPool.BLANK,
				StringPool.BLANK, 1);
		}

		return status;
	}

	@Override
	public Status updateStatus(long userId, long modifiedDate) {
		return updateStatus(userId, modifiedDate, -1, -1, null, null, -1);
	}

	@Override
	public Status updateStatus(
		long userId, long modifiedDate, int online, int awake,
		String activePanelIds, String message, int playSound) {

		Status status = statusPersistence.fetchByUserId(userId);

		if (status == null) {
			long statusId = counterLocalService.increment();

			status = statusPersistence.create(statusId);

			status.setUserId(userId);
		}

		if (modifiedDate != -1) {
			status.setModifiedDate(modifiedDate);
		}

		if (online != -1) {
			status.setOnline((online == 1) ? true : false);
		}

		if (awake != -1) {
			status.setAwake((awake == 1) ? true : false);
		}

		if (Validator.isNotNull(activePanelIds)) {
			try {
				JSONObject activePanelIdsJSONObject =
					_jsonFactory.createJSONObject(activePanelIds);

				long openPanelId = activePanelIdsJSONObject.getLong("open");

				List<Entry> entries = entryPersistence.findByF_T(
					openPanelId, userId);

				for (Entry entry : entries) {
					entry.setFlag(EntryConstants.FLAG_READ);

					entryPersistence.update(entry);
				}
			}
			catch (JSONException jsonException) {
				_log.error(
					"Unable to create a JSON object from " + activePanelIds,
					jsonException);
			}

			status.setActivePanelIds(activePanelIds);
		}

		if (message != null) {
			status.setMessage(message);
		}

		if (playSound != -1) {
			status.setPlaySound((playSound == 1) ? true : false);
		}

		try {
			status = statusPersistence.update(status);
		}
		catch (SystemException systemException) {
			if (_log.isWarnEnabled()) {
				_log.warn("Add failed, fetch {userId=" + userId + "}");
			}

			status = statusPersistence.fetchByUserId(userId);

			if (status == null) {
				throw systemException;
			}
		}

		JabberUtil.updateStatus(userId, online);

		return status;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		StatusLocalServiceImpl.class);

	@Reference
	private JSONFactory _jsonFactory;

}