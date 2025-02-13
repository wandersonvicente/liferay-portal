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

package com.liferay.analytics.settings.rest.internal.dto.v1_0.converter;

import com.liferay.portal.vulcan.dto.converter.DefaultDTOConverterContext;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * @author Riccardo Ferrari
 */
public class CommerceChannelDTOConverterContext
	extends DefaultDTOConverterContext {

	public CommerceChannelDTOConverterContext(
		Object id, Locale locale, Map<Long, String> channelNames) {

		super(false, new HashMap<>(), null, id, locale, null, null);

		_channelNames = channelNames;
	}

	public String getChannelName(Long analyticsChannelId) {
		if (analyticsChannelId == null) {
			return null;
		}

		return _channelNames.getOrDefault(analyticsChannelId, null);
	}

	private final Map<Long, String> _channelNames;

}