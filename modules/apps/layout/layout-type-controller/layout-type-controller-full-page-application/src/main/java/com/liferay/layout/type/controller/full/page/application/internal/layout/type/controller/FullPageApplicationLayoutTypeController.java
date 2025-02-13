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

package com.liferay.layout.type.controller.full.page.application.internal.layout.type.controller;

import com.liferay.layout.type.controller.BaseLayoutTypeControllerImpl;
import com.liferay.layout.type.controller.full.page.application.internal.constants.FullPageApplicationLayoutTypeControllerConstants;
import com.liferay.layout.type.controller.full.page.application.internal.constants.FullPageApplicationLayoutTypeControllerWebKeys;
import com.liferay.petra.io.unsync.UnsyncStringWriter;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.model.LayoutTypeController;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.service.PortletLocalService;
import com.liferay.portal.kernel.servlet.PipingServletResponse;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Juergen Kappler
 */
@Component(
	immediate = true,
	property = "layout.type=" + FullPageApplicationLayoutTypeControllerConstants.LAYOUT_TYPE_FULL_PAGE_APPLICATION,
	service = LayoutTypeController.class
)
public class FullPageApplicationLayoutTypeController
	extends BaseLayoutTypeControllerImpl {

	@Override
	public String getType() {
		return LayoutConstants.TYPE_PORTLET;
	}

	@Override
	public String getURL() {
		return _URL;
	}

	@Override
	public String includeEditContent(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, Layout layout)
		throws Exception {

		httpServletRequest.setAttribute(WebKeys.SEL_LAYOUT, layout);

		return super.includeEditContent(
			httpServletRequest, httpServletResponse, layout);
	}

	@Override
	public boolean isBrowsable() {
		return true;
	}

	@Override
	public boolean isFirstPageable() {
		return true;
	}

	@Override
	public boolean isFullPageDisplayable() {
		return true;
	}

	@Override
	public boolean isParentable() {
		return true;
	}

	@Override
	public boolean isSitemapable() {
		return false;
	}

	@Override
	public boolean isURLFriendliable() {
		return true;
	}

	@Override
	protected void addAttributes(HttpServletRequest httpServletRequest) {
		super.addAttributes(httpServletRequest);

		List<Portlet> portlets = _portletLocalService.getPortlets();

		if (portlets.isEmpty()) {
			return;
		}

		portlets = ListUtil.filter(portlets, Portlet::isFullPageDisplayable);

		httpServletRequest.setAttribute(
			FullPageApplicationLayoutTypeControllerWebKeys.
				FULL_PAGE_APPLICATION_PORTLETS,
			portlets);
	}

	@Override
	protected ServletResponse createServletResponse(
		HttpServletResponse httpServletResponse,
		UnsyncStringWriter unsyncStringWriter) {

		return new PipingServletResponse(
			httpServletResponse, unsyncStringWriter);
	}

	@Override
	protected String getEditPage() {
		return _EDIT_PAGE;
	}

	@Override
	protected ServletContext getServletContext() {
		return _servletContext;
	}

	@Override
	protected String getViewPage() {
		return _VIEW_PAGE;
	}

	@Override
	protected void removeAttributes(HttpServletRequest httpServletRequest) {
		httpServletRequest.removeAttribute(WebKeys.SEL_LAYOUT);

		super.removeAttributes(httpServletRequest);
	}

	@Reference(unbind = "-")
	protected void setPortletLocalService(
		PortletLocalService portletLocalService) {

		_portletLocalService = portletLocalService;
	}

	private static final String _EDIT_PAGE =
		"/layout/edit/full_page_application.jsp";

	private static final String _URL =
		"${liferay:mainPath}/portal/layout?p_l_id=${liferay:plid}" +
			"&p_v_l_s_g_id=${liferay:pvlsgid}";

	private static final String _VIEW_PAGE =
		"/layout/view/full_page_application.jsp";

	private PortletLocalService _portletLocalService;

	@Reference(
		target = "(osgi.web.symbolicname=com.liferay.layout.type.controller.full.page.application)"
	)
	private ServletContext _servletContext;

}