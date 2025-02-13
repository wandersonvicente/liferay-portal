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

package com.liferay.portal.search.web.internal.facet.display.context;

/**
 * @author Bryan Engler
 */
public class BucketDisplayContext {

	public String getBucketText() {
		return _bucketText;
	}

	public String getFilterValue() {
		return _filterValue;
	}

	public int getFrequency() {
		return _frequency;
	}

	public int getPopularity() {
		return _popularity;
	}

	public boolean isFrequencyVisible() {
		return _frequencyVisible;
	}

	public boolean isSelected() {
		return _selected;
	}

	public void setBucketText(String bucketText) {
		_bucketText = bucketText;
	}

	public void setFilterValue(String filterValue) {
		_filterValue = filterValue;
	}

	public void setFrequency(int frequency) {
		_frequency = frequency;
	}

	public void setFrequencyVisible(boolean frequencyVisible) {
		_frequencyVisible = frequencyVisible;
	}

	public void setPopularity(int popularity) {
		_popularity = popularity;
	}

	public void setSelected(boolean selected) {
		_selected = selected;
	}

	private String _bucketText;
	private String _filterValue;
	private int _frequency;
	private boolean _frequencyVisible;
	private int _popularity;
	private boolean _selected;

}