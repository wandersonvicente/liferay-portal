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

package com.liferay.asset.util.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetTag;
import com.liferay.asset.kernel.model.AssetVocabulary;
import com.liferay.asset.kernel.service.persistence.AssetEntryQuery;
import com.liferay.asset.test.util.AssetTestUtil;
import com.liferay.asset.util.AssetHelper;
import com.liferay.blogs.model.BlogsEntry;
import com.liferay.blogs.service.BlogsEntryLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.search.BaseModelSearchResult;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.ServiceContextTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.test.util.UserTestUtil;
import com.liferay.portal.search.hits.SearchHits;
import com.liferay.portal.search.test.util.SearchTestRule;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Eduardo García
 */
@RunWith(Arquillian.class)
public class AssetHelperTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		UserTestUtil.setUser(TestPropsValues.getUser());

		_group = GroupTestUtil.addGroup();

		_assetVocabulary = AssetTestUtil.addVocabulary(_group.getGroupId());

		_assetCategory = null;

		_assetTag = null;
	}

	@Test
	public void testFilterAssetEntriesByTagWithWhiteSpace() throws Exception {
		_assetCategory = AssetTestUtil.addCategory(
			_group.getGroupId(), _assetVocabulary.getVocabularyId());

		_assetTag = AssetTestUtil.addTag(_group.getGroupId(), "asset tag");

		AssetEntryQuery assetEntryQuery = new AssetEntryQuery();

		assetEntryQuery.setGroupIds(new long[] {_group.getGroupId()});

		long[] assetCategoryIds = new long[0];
		String[] assetTagNames = {_assetTag.getName()};

		assertCount(
			0, assetEntryQuery, assetCategoryIds, assetTagNames, null,
			_group.getCompanyId(), StringPool.BLANK, null, null,
			_group.getGroupId(), null, _group.getCreatorUserId());

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(_group.getGroupId());

		BlogsEntryLocalServiceUtil.addEntry(
			TestPropsValues.getUserId(), RandomTestUtil.randomString(),
			StringPool.BLANK, StringPool.BLANK, RandomTestUtil.randomString(),
			1, 1, 1965, 0, 0, true, true, null, StringPool.BLANK, null, null,
			serviceContext);

		serviceContext.setAssetCategoryIds(assetCategoryIds);
		serviceContext.setAssetTagNames(assetTagNames);

		BlogsEntryLocalServiceUtil.addEntry(
			TestPropsValues.getUserId(), RandomTestUtil.randomString(),
			StringPool.BLANK, StringPool.BLANK, RandomTestUtil.randomString(),
			1, 1, 1965, 0, 0, true, true, null, StringPool.BLANK, null, null,
			serviceContext);

		assertCount(
			1, assetEntryQuery, assetCategoryIds, assetTagNames, null,
			_group.getCompanyId(), null, null, null, _group.getGroupId(), null,
			_group.getCreatorUserId());
	}

	@Test
	public void testSearchAssetEntries() throws Exception {
		_assetCategory = AssetTestUtil.addCategory(
			_group.getGroupId(), _assetVocabulary.getVocabularyId());

		_assetTag = AssetTestUtil.addTag(_group.getGroupId());

		AssetEntryQuery assetEntryQuery = new AssetEntryQuery();

		assetEntryQuery.setGroupIds(new long[] {_group.getGroupId()});

		long[] assetCategoryIds = {_assetCategory.getCategoryId()};
		String[] assetTagNames = {_assetTag.getName()};

		assertCount(
			0, assetEntryQuery, assetCategoryIds, assetTagNames, null,
			_group.getCompanyId(), StringPool.BLANK, null, null,
			_group.getGroupId(), null, _group.getCreatorUserId());

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(_group.getGroupId());

		serviceContext.setAssetCategoryIds(assetCategoryIds);
		serviceContext.setAssetTagNames(assetTagNames);

		BlogsEntryLocalServiceUtil.addEntry(
			TestPropsValues.getUserId(), RandomTestUtil.randomString(),
			StringPool.BLANK, StringPool.BLANK, RandomTestUtil.randomString(),
			1, 1, 1965, 0, 0, true, true, null, StringPool.BLANK, null, null,
			serviceContext);

		assertCount(
			1, assetEntryQuery, assetCategoryIds, assetTagNames, null,
			_group.getCompanyId(), StringPool.BLANK, null, null,
			_group.getGroupId(), null, _group.getCreatorUserId());
	}

	@Test
	public void testSearchWithMultipleAssetQueryByGroupId() throws Exception {
		Group group1 = GroupTestUtil.addGroup();
		Group group2 = GroupTestUtil.addGroup();

		try {
			BlogsEntryLocalServiceUtil.addEntry(
				TestPropsValues.getUserId(), RandomTestUtil.randomString(),
				StringPool.BLANK, StringPool.BLANK,
				RandomTestUtil.randomString(), 1, 1, 1965, 0, 0, true, true,
				null, StringPool.BLANK, null, null,
				ServiceContextTestUtil.getServiceContext(_group.getGroupId()));

			BlogsEntryLocalServiceUtil.addEntry(
				TestPropsValues.getUserId(), RandomTestUtil.randomString(),
				StringPool.BLANK, StringPool.BLANK,
				RandomTestUtil.randomString(), 1, 1, 1965, 0, 0, true, true,
				null, StringPool.BLANK, null, null,
				ServiceContextTestUtil.getServiceContext(group1.getGroupId()));

			BlogsEntryLocalServiceUtil.addEntry(
				TestPropsValues.getUserId(), RandomTestUtil.randomString(),
				StringPool.BLANK, StringPool.BLANK,
				RandomTestUtil.randomString(), 1, 1, 1965, 0, 0, true, true,
				null, StringPool.BLANK, null, null,
				ServiceContextTestUtil.getServiceContext(_group.getGroupId()));

			AssetEntryQuery assetEntryQuery1 = new AssetEntryQuery();

			assetEntryQuery1.setGroupIds(new long[] {_group.getGroupId()});

			AssetEntryQuery assetEntryQuery2 = new AssetEntryQuery();

			assetEntryQuery2.setGroupIds(new long[] {_group.getGroupId()});

			SearchContext searchContext = new SearchContext();

			searchContext.setCompanyId(_group.getCompanyId());

			SearchHits searchHits = _assetHelper.search(
				searchContext,
				Arrays.asList(assetEntryQuery1, assetEntryQuery2),
				QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			Assert.assertEquals(
				searchHits.toString(), 2, searchHits.getTotalHits());
		}
		finally {
			GroupTestUtil.deleteGroup(group1);
			GroupTestUtil.deleteGroup(group2);
		}
	}

	@Test
	public void testSearchWithMultipleAssetQueryByTags() throws Exception {
		AssetTag assetTag1 = AssetTestUtil.addTag(
			_group.getGroupId(), "asset tag1");
		AssetTag assetTag2 = AssetTestUtil.addTag(
			_group.getGroupId(), "asset tag2");

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(_group.getGroupId());

		serviceContext.setAssetTagNames(new String[] {assetTag1.getName()});

		BlogsEntryLocalServiceUtil.addEntry(
			TestPropsValues.getUserId(), RandomTestUtil.randomString(),
			StringPool.BLANK, StringPool.BLANK, RandomTestUtil.randomString(),
			1, 1, 1965, 0, 0, true, true, null, StringPool.BLANK, null, null,
			serviceContext);

		serviceContext = ServiceContextTestUtil.getServiceContext(
			_group.getGroupId());

		serviceContext.setAssetTagNames(new String[] {assetTag2.getName()});

		BlogsEntryLocalServiceUtil.addEntry(
			TestPropsValues.getUserId(), RandomTestUtil.randomString(),
			StringPool.BLANK, StringPool.BLANK, RandomTestUtil.randomString(),
			1, 1, 1965, 0, 0, true, true, null, StringPool.BLANK, null, null,
			serviceContext);

		BlogsEntryLocalServiceUtil.addEntry(
			TestPropsValues.getUserId(), RandomTestUtil.randomString(),
			StringPool.BLANK, StringPool.BLANK, RandomTestUtil.randomString(),
			1, 1, 1965, 0, 0, true, true, null, StringPool.BLANK, null, null,
			ServiceContextTestUtil.getServiceContext(_group.getGroupId()));

		AssetEntryQuery assetEntryQuery1 = new AssetEntryQuery();

		assetEntryQuery1.setGroupIds(new long[] {_group.getGroupId()});
		assetEntryQuery1.setAllTagIds(new long[] {assetTag1.getTagId()});
		assetEntryQuery1.setClassName(BlogsEntry.class.getName());

		AssetEntryQuery assetEntryQuery2 = new AssetEntryQuery();

		assetEntryQuery2.setGroupIds(new long[] {_group.getGroupId()});
		assetEntryQuery2.setAllTagIds(new long[] {assetTag2.getTagId()});
		assetEntryQuery2.setClassName(BlogsEntry.class.getName());

		SearchContext searchContext = new SearchContext();

		searchContext.setCompanyId(_group.getCompanyId());

		SearchHits searchHits = _assetHelper.search(
			searchContext, Arrays.asList(assetEntryQuery1, assetEntryQuery2),
			QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		Assert.assertEquals(
			searchHits.toString(), 2, searchHits.getTotalHits());
	}

	@Rule
	public SearchTestRule searchTestRule = new SearchTestRule();

	protected void assertCount(
			int expectedCount, AssetEntryQuery assetEntryQuery,
			long[] assetCategoryIds, String[] assetTagNames,
			Map<String, Serializable> attributes, long companyId,
			String keywords, Layout layout, Locale locale, long scopeGroupId,
			TimeZone timeZone, long userId)
		throws Exception {

		BaseModelSearchResult<AssetEntry> baseModelSearchResult =
			_assetHelper.searchAssetEntries(
				assetEntryQuery, assetCategoryIds, assetTagNames, attributes,
				companyId, keywords, layout, locale, scopeGroupId, timeZone,
				userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		Assert.assertEquals(
			baseModelSearchResult.toString(), expectedCount,
			baseModelSearchResult.getLength());
	}

	private AssetCategory _assetCategory;

	@Inject
	private AssetHelper _assetHelper;

	private AssetTag _assetTag;
	private AssetVocabulary _assetVocabulary;

	@DeleteAfterTestRun
	private Group _group;

}