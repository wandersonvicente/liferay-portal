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

import {LAYOUT_DATA_ITEM_TYPES} from '../config/constants/layoutDataItemTypes';
import {getDescendantIds} from './getDescendantIds';
import {getResponsiveConfig} from './getResponsiveConfig';
import {isRequiredFormInput} from './isRequiredFormInput';

function isItemHidden(layoutData, itemId, selectedViewportSize) {
	const item = layoutData?.items[itemId];

	if (!item) {
		return false;
	}

	const responsiveConfig = getResponsiveConfig(
		item.config,
		selectedViewportSize
	);

	return (
		responsiveConfig.styles.display === 'none' ||
		isItemHidden(layoutData, item.parentId, selectedViewportSize)
	);
}

export default function hasRequiredInputChild({
	checkHidden = false,
	formFields,
	fragmentEntryLinks,
	itemId,
	layoutData,
	selectedViewportSize = null,
}) {
	const descendantIds = getDescendantIds(layoutData, itemId);

	return descendantIds.some((descendantId) => {
		const item = layoutData.items[descendantId];

		if (item.type !== LAYOUT_DATA_ITEM_TYPES.fragment) {
			return false;
		}

		return (
			(!checkHidden ||
				isItemHidden(layoutData, descendantId, selectedViewportSize)) &&
			isRequiredFormInput(item, fragmentEntryLinks, formFields)
		);
	});
}
