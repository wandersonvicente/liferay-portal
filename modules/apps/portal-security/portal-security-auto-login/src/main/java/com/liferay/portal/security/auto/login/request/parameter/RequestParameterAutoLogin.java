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

package com.liferay.portal.security.auto.login.request.parameter;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.security.auto.login.AutoLogin;
import com.liferay.portal.kernel.security.auto.login.BaseAutoLogin;
import com.liferay.portal.kernel.settings.CompanyServiceSettingsLocator;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.security.auto.login.internal.request.parameter.configuration.RequestParameterAutoLoginConfiguration;
import com.liferay.portal.security.auto.login.internal.request.parameter.constants.RequestParameterAutoLoginConstants;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Minhchau Dang
 * @author Tomas Polesovsky
 */
@Component(
	configurationPid = "com.liferay.portal.security.auto.login.internal.request.parameter.configuration.RequestParameterAutoLoginConfiguration",
	immediate = true, property = "type=request.parameter",
	service = AutoLogin.class
)
public class RequestParameterAutoLogin extends BaseAutoLogin {

	@Override
	protected String[] doLogin(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws Exception {

		if (!isEnabled(_portal.getCompanyId(httpServletRequest))) {
			return null;
		}

		return _autoLogin.login(httpServletRequest, httpServletResponse);
	}

	protected boolean isEnabled(long companyId) {
		RequestParameterAutoLoginConfiguration
			requestParameterAutoLoginConfiguration =
				_getRequestParameterAutoLoginConfiguration(companyId);

		if (requestParameterAutoLoginConfiguration == null) {
			return false;
		}

		return requestParameterAutoLoginConfiguration.enabled();
	}

	private RequestParameterAutoLoginConfiguration
		_getRequestParameterAutoLoginConfiguration(long companyId) {

		try {
			return _configurationProvider.getConfiguration(
				RequestParameterAutoLoginConfiguration.class,
				new CompanyServiceSettingsLocator(
					companyId,
					RequestParameterAutoLoginConstants.SERVICE_NAME));
		}
		catch (ConfigurationException configurationException) {
			_log.error(
				"Unable to get request parameter auto login configuration",
				configurationException);
		}

		return null;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		RequestParameterAutoLogin.class);

	@Reference(target = "(&(private.auto.login=true)(type=request.parameter))")
	private AutoLogin _autoLogin;

	@Reference
	private ConfigurationProvider _configurationProvider;

	@Reference
	private Portal _portal;

}