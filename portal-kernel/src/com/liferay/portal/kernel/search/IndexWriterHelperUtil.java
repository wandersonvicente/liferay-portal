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

package com.liferay.portal.kernel.search;

import com.liferay.portal.kernel.backgroundtask.BackgroundTask;
import com.liferay.portal.kernel.util.ServiceProxyFactory;

import java.io.Serializable;

import java.util.Collection;
import java.util.Locale;
import java.util.Map;

/**
 * @author Michael C. Han
 */
public class IndexWriterHelperUtil {

	public static void addDocument(
			long companyId, Document document, boolean commitImmediately)
		throws SearchException {

		_indexWriterHelper.addDocument(companyId, document, commitImmediately);
	}

	public static void addDocuments(
			long companyId, Collection<Document> documents,
			boolean commitImmediately)
		throws SearchException {

		_indexWriterHelper.addDocuments(
			companyId, documents, commitImmediately);
	}

	public static void commit() throws SearchException {
		_indexWriterHelper.commit();
	}

	public static void commit(long companyId) throws SearchException {
		_indexWriterHelper.commit(companyId);
	}

	public static void deleteDocument(
			long companyId, String uid, boolean commitImmediately)
		throws SearchException {

		_indexWriterHelper.deleteDocument(companyId, uid, commitImmediately);
	}

	public static void deleteDocuments(
			long companyId, Collection<String> uids, boolean commitImmediately)
		throws SearchException {

		_indexWriterHelper.deleteDocuments(companyId, uids, commitImmediately);
	}

	public static void deleteEntityDocuments(
			long companyId, String className, boolean commitImmediately)
		throws SearchException {

		_indexWriterHelper.deleteEntityDocuments(
			companyId, className, commitImmediately);
	}

	public static int getReindexTaskCount(long groupId, boolean completed)
		throws SearchException {

		return _indexWriterHelper.getReindexTaskCount(groupId, completed);
	}

	public static void indexKeyword(
			long companyId, String querySuggestion, float weight,
			String keywordType, Locale locale)
		throws SearchException {

		_indexWriterHelper.indexKeyword(
			companyId, querySuggestion, weight, keywordType, locale);
	}

	public static void indexQuerySuggestionDictionaries(long companyId)
		throws SearchException {

		_indexWriterHelper.indexQuerySuggestionDictionaries(companyId);
	}

	public static void indexQuerySuggestionDictionary(
			long companyId, Locale locale)
		throws SearchException {

		_indexWriterHelper.indexQuerySuggestionDictionary(companyId, locale);
	}

	public static void indexSpellCheckerDictionaries(long companyId)
		throws SearchException {

		_indexWriterHelper.indexSpellCheckerDictionaries(companyId);
	}

	public static void indexSpellCheckerDictionary(
			long companyId, Locale locale)
		throws SearchException {

		_indexWriterHelper.indexSpellCheckerDictionary(companyId, locale);
	}

	/**
	 * @deprecated As of Wilberforce (7.0.x), replaced by {@link
	 *             com.liferay.portal.search.index.IndexStatusManager#isIndexReadOnly}
	 */
	@Deprecated
	public static boolean isIndexReadOnly() {
		if (IndexStatusManagerThreadLocal.isIndexReadOnly() ||
			_indexWriterHelper.isIndexReadOnly()) {

			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of Judson (7.1.x), replaced by {@link
	 *             com.liferay.portal.search.index.IndexStatusManager#isIndexReadOnly(
	 *             String)}
	 */
	@Deprecated
	public static boolean isIndexReadOnly(String className) {
		return _indexWriterHelper.isIndexReadOnly(className);
	}

	public static void partiallyUpdateDocument(
			long companyId, Document document, boolean commitImmediately)
		throws SearchException {

		_indexWriterHelper.partiallyUpdateDocument(
			companyId, document, commitImmediately);
	}

	public static void partiallyUpdateDocuments(
			long companyId, Collection<Document> documents,
			boolean commitImmediately)
		throws SearchException {

		_indexWriterHelper.partiallyUpdateDocuments(
			companyId, documents, commitImmediately);
	}

	public static BackgroundTask reindex(
			long userId, String jobName, long[] companyIds,
			Map<String, Serializable> taskContextMap)
		throws SearchException {

		return _indexWriterHelper.reindex(
			userId, jobName, companyIds, taskContextMap);
	}

	public static BackgroundTask reindex(
			long userId, String jobName, long[] companyIds, String className,
			Map<String, Serializable> taskContextMap)
		throws SearchException {

		return _indexWriterHelper.reindex(
			userId, jobName, companyIds, className, taskContextMap);
	}

	/**
	 * @deprecated As of Wilberforce (7.0.x), replaced by {@link
	 *             com.liferay.portal.search.index.IndexStatusManager#setIndexReadOnly(
	 *             boolean)}
	 */
	@Deprecated
	public static void setIndexReadOnly(boolean indexReadOnly) {
		_indexWriterHelper.setIndexReadOnly(indexReadOnly);
	}

	/**
	 * @deprecated As of Judson (7.1.x), replaced by {@link
	 *             com.liferay.portal.search.index.IndexStatusManager#setIndexReadOnly(
	 *             String, boolean)}
	 */
	@Deprecated
	public static void setIndexReadOnly(
		String className, boolean indexReadOnly) {

		_indexWriterHelper.setIndexReadOnly(className, indexReadOnly);
	}

	public static void updateDocument(
			long companyId, Document document, boolean commitImmediately)
		throws SearchException {

		_indexWriterHelper.updateDocument(
			companyId, document, commitImmediately);
	}

	public static void updateDocuments(
			long companyId, Collection<Document> documents,
			boolean commitImmediately)
		throws SearchException {

		_indexWriterHelper.updateDocuments(
			companyId, documents, commitImmediately);
	}

	public static void updatePermissionFields(String name, String primKey) {
		_indexWriterHelper.updatePermissionFields(name, primKey);
	}

	private static volatile IndexWriterHelper _indexWriterHelper =
		ServiceProxyFactory.newServiceTrackedInstance(
			IndexWriterHelper.class, IndexWriterHelperUtil.class,
			"_indexWriterHelper", false);

}