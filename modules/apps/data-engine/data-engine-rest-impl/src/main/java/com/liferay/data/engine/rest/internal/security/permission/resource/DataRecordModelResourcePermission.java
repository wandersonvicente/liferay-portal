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

package com.liferay.data.engine.rest.internal.security.permission.resource;

import com.liferay.data.engine.content.type.DataDefinitionContentType;
import com.liferay.data.engine.rest.internal.content.type.DataDefinitionContentTypeTracker;
import com.liferay.dynamic.data.lists.model.DDLRecord;
import com.liferay.dynamic.data.lists.model.DDLRecordSet;
import com.liferay.dynamic.data.lists.service.DDLRecordLocalService;
import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.util.Portal;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Inácio Nery
 */
@Component(
	property = "model.class.name=com.liferay.dynamic.data.lists.model.DDLRecord",
	service = DataRecordModelResourcePermission.class
)
public class DataRecordModelResourcePermission
	implements ModelResourcePermission<DDLRecord> {

	@Override
	public void check(
			PermissionChecker permissionChecker, DDLRecord ddlRecord,
			String actionId)
		throws PortalException {

		if (!contains(permissionChecker, ddlRecord, actionId)) {
			throw new PrincipalException.MustHavePermission(
				permissionChecker, _getModelResourceName(ddlRecord),
				ddlRecord.getRecordId(), actionId);
		}
	}

	@Override
	public void check(
			PermissionChecker permissionChecker, long primaryKey,
			String actionId)
		throws PortalException {

		check(
			permissionChecker, _ddlRecordLocalService.getDDLRecord(primaryKey),
			actionId);
	}

	@Override
	public boolean contains(
			PermissionChecker permissionChecker, DDLRecord ddlRecord,
			String actionId)
		throws PortalException {

		DDLRecordSet recordSet = ddlRecord.getRecordSet();

		boolean hasPermission =
			_dataRecordCollectionModelResourcePermission.contains(
				permissionChecker, recordSet, actionId);

		if (hasPermission) {
			return true;
		}

		DDMStructure ddmStructure = recordSet.getDDMStructure();

		DataDefinitionContentType dataDefinitionContentType =
			_dataDefinitionContentTypeTracker.getDataDefinitionContentType(
				ddmStructure.getClassNameId());

		if (dataDefinitionContentType == null) {
			return false;
		}

		return dataDefinitionContentType.hasPermission(
			permissionChecker, ddlRecord.getCompanyId(), ddlRecord.getGroupId(),
			_getModelResourceName(ddlRecord), ddlRecord.getRecordId(),
			ddlRecord.getUserId(), actionId);
	}

	@Override
	public boolean contains(
			PermissionChecker permissionChecker, long primaryKey,
			String actionId)
		throws PortalException {

		return contains(
			permissionChecker, _ddlRecordLocalService.getDDLRecord(primaryKey),
			actionId);
	}

	@Override
	public String getModelName() {
		return DDLRecord.class.getName();
	}

	@Override
	public PortletResourcePermission getPortletResourcePermission() {
		return null;
	}

	private String _getModelResourceName(DDLRecord ddlRecord)
		throws PortalException {

		DDLRecordSet recordSet = ddlRecord.getRecordSet();

		DDMStructure ddmStructure = recordSet.getDDMStructure();

		return ResourceActionsUtil.getCompositeModelName(
			_portal.getClassName(ddmStructure.getClassNameId()),
			DDLRecord.class.getName());
	}

	@Reference
	private DataDefinitionContentTypeTracker _dataDefinitionContentTypeTracker;

	@Reference
	private DataRecordCollectionModelResourcePermission
		_dataRecordCollectionModelResourcePermission;

	@Reference
	private DDLRecordLocalService _ddlRecordLocalService;

	@Reference
	private Portal _portal;

}