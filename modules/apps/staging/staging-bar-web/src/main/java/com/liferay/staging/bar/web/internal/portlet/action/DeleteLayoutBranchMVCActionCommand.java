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

package com.liferay.staging.bar.web.internal.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.LayoutBranchService;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.staging.bar.web.internal.portlet.constants.StagingBarPortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Máté Thurzó
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + StagingBarPortletKeys.STAGING_BAR,
		"mvc.command.name=/staging_bar/delete_layout_branch"
	},
	service = MVCActionCommand.class
)
public class DeleteLayoutBranchMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long layoutBranchId = ParamUtil.getLong(
			actionRequest, "layoutBranchId");

		long currentLayoutBranchId = ParamUtil.getLong(
			actionRequest, "currentLayoutBranchId");

		try {
			_layoutBranchService.deleteLayoutBranch(layoutBranchId);

			SessionMessages.add(actionRequest, "pageVariationDeleted");

			if (layoutBranchId == currentLayoutBranchId) {
				SessionMessages.add(
					actionRequest,
					_portal.getPortletId(actionRequest) +
						SessionMessages.KEY_SUFFIX_PORTLET_NOT_AJAXABLE);
			}

			ActionUtil.addLayoutBranchSessionMessages(
				actionRequest, actionResponse);
		}
		catch (Exception exception) {
			SessionErrors.add(actionRequest, exception.getClass(), exception);

			actionResponse.setRenderParameter("mvcPath", "/error.jsp");
		}
	}

	@Reference
	private LayoutBranchService _layoutBranchService;

	@Reference
	private Portal _portal;

}