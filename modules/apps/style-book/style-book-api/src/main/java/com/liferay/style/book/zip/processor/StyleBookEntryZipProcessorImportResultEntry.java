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

package com.liferay.style.book.zip.processor;

import com.liferay.style.book.model.StyleBookEntry;

/**
 * @author Jürgen Kappler
 */
public class StyleBookEntryZipProcessorImportResultEntry {

	public StyleBookEntryZipProcessorImportResultEntry(
		String name, Status status, String errorMessage) {

		_name = name;
		_errorMessage = errorMessage;

		_status = Status.INVALID;
	}

	public StyleBookEntryZipProcessorImportResultEntry(
		String name, Status status, StyleBookEntry styleBookEntry) {

		_name = name;
		_status = status;
		_styleBookEntry = styleBookEntry;
	}

	public String getErrorMessage() {
		return _errorMessage;
	}

	public String getName() {
		return _name;
	}

	public Status getStatus() {
		return _status;
	}

	public StyleBookEntry getStyleBookEntry() {
		return _styleBookEntry;
	}

	public enum Status {

		IMPORTED("imported"), INVALID("invalid");

		public String getLabel() {
			return _label;
		}

		private Status(String label) {
			_label = label;
		}

		private final String _label;

	}

	private String _errorMessage;
	private final String _name;
	private final Status _status;
	private StyleBookEntry _styleBookEntry;

}