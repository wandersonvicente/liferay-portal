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

package com.liferay.calendar.service.persistence;

import com.liferay.calendar.model.CalendarResource;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the calendar resource service. This utility wraps <code>com.liferay.calendar.service.persistence.impl.CalendarResourcePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eduardo Lundgren
 * @see CalendarResourcePersistence
 * @generated
 */
public class CalendarResourceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CalendarResource calendarResource) {
		getPersistence().clearCache(calendarResource);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CalendarResource> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CalendarResource> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CalendarResource> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CalendarResource> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CalendarResource update(CalendarResource calendarResource) {
		return getPersistence().update(calendarResource);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CalendarResource update(
		CalendarResource calendarResource, ServiceContext serviceContext) {

		return getPersistence().update(calendarResource, serviceContext);
	}

	/**
	 * Returns all the calendar resources where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching calendar resources
	 */
	public static List<CalendarResource> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the calendar resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of matching calendar resources
	 */
	public static List<CalendarResource> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the calendar resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first calendar resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByUuid_First(
			String uuid, OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first calendar resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByUuid_First(
		String uuid, OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByUuid_Last(
			String uuid, OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByUuid_Last(
		String uuid, OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the calendar resources before and after the current calendar resource in the ordered set where uuid = &#63;.
	 *
	 * @param calendarResourceId the primary key of the current calendar resource
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next calendar resource
	 * @throws NoSuchResourceException if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource[] findByUuid_PrevAndNext(
			long calendarResourceId, String uuid,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByUuid_PrevAndNext(
			calendarResourceId, uuid, orderByComparator);
	}

	/**
	 * Removes all the calendar resources where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of calendar resources where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching calendar resources
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the calendar resource where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchResourceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByUUID_G(String uuid, long groupId)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the calendar resource where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the calendar resource where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the calendar resource where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the calendar resource that was removed
	 */
	public static CalendarResource removeByUUID_G(String uuid, long groupId)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of calendar resources where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching calendar resources
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the calendar resources where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching calendar resources
	 */
	public static List<CalendarResource> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the calendar resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of matching calendar resources
	 */
	public static List<CalendarResource> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the calendar resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first calendar resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first calendar resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the calendar resources before and after the current calendar resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param calendarResourceId the primary key of the current calendar resource
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next calendar resource
	 * @throws NoSuchResourceException if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource[] findByUuid_C_PrevAndNext(
			long calendarResourceId, String uuid, long companyId,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByUuid_C_PrevAndNext(
			calendarResourceId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the calendar resources where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of calendar resources where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching calendar resources
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the calendar resources where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching calendar resources
	 */
	public static List<CalendarResource> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the calendar resources where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of matching calendar resources
	 */
	public static List<CalendarResource> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the calendar resources where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first calendar resource in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByGroupId_First(
			long groupId, OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first calendar resource in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByGroupId_First(
		long groupId, OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByGroupId_Last(
			long groupId, OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByGroupId_Last(
		long groupId, OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the calendar resources before and after the current calendar resource in the ordered set where groupId = &#63;.
	 *
	 * @param calendarResourceId the primary key of the current calendar resource
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next calendar resource
	 * @throws NoSuchResourceException if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource[] findByGroupId_PrevAndNext(
			long calendarResourceId, long groupId,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByGroupId_PrevAndNext(
			calendarResourceId, groupId, orderByComparator);
	}

	/**
	 * Returns all the calendar resources that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching calendar resources that the user has permission to view
	 */
	public static List<CalendarResource> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	 * Returns a range of all the calendar resources that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of matching calendar resources that the user has permission to view
	 */
	public static List<CalendarResource> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendar resources that the user has permission to view
	 */
	public static List<CalendarResource> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the calendar resources before and after the current calendar resource in the ordered set of calendar resources that the user has permission to view where groupId = &#63;.
	 *
	 * @param calendarResourceId the primary key of the current calendar resource
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next calendar resource
	 * @throws NoSuchResourceException if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource[] filterFindByGroupId_PrevAndNext(
			long calendarResourceId, long groupId,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			calendarResourceId, groupId, orderByComparator);
	}

	/**
	 * Removes all the calendar resources where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of calendar resources where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching calendar resources
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of calendar resources that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching calendar resources that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Returns all the calendar resources where active = &#63;.
	 *
	 * @param active the active
	 * @return the matching calendar resources
	 */
	public static List<CalendarResource> findByActive(boolean active) {
		return getPersistence().findByActive(active);
	}

	/**
	 * Returns a range of all the calendar resources where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of matching calendar resources
	 */
	public static List<CalendarResource> findByActive(
		boolean active, int start, int end) {

		return getPersistence().findByActive(active, start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByActive(
		boolean active, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().findByActive(
			active, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the calendar resources where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByActive(
		boolean active, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByActive(
			active, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first calendar resource in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByActive_First(
			boolean active,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByActive_First(active, orderByComparator);
	}

	/**
	 * Returns the first calendar resource in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByActive_First(
		boolean active, OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByActive_First(active, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByActive_Last(
			boolean active,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByActive_Last(active, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByActive_Last(
		boolean active, OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByActive_Last(active, orderByComparator);
	}

	/**
	 * Returns the calendar resources before and after the current calendar resource in the ordered set where active = &#63;.
	 *
	 * @param calendarResourceId the primary key of the current calendar resource
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next calendar resource
	 * @throws NoSuchResourceException if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource[] findByActive_PrevAndNext(
			long calendarResourceId, boolean active,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByActive_PrevAndNext(
			calendarResourceId, active, orderByComparator);
	}

	/**
	 * Removes all the calendar resources where active = &#63; from the database.
	 *
	 * @param active the active
	 */
	public static void removeByActive(boolean active) {
		getPersistence().removeByActive(active);
	}

	/**
	 * Returns the number of calendar resources where active = &#63;.
	 *
	 * @param active the active
	 * @return the number of matching calendar resources
	 */
	public static int countByActive(boolean active) {
		return getPersistence().countByActive(active);
	}

	/**
	 * Returns all the calendar resources where groupId = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the matching calendar resources
	 */
	public static List<CalendarResource> findByG_C(long groupId, String code) {
		return getPersistence().findByG_C(groupId, code);
	}

	/**
	 * Returns a range of all the calendar resources where groupId = &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of matching calendar resources
	 */
	public static List<CalendarResource> findByG_C(
		long groupId, String code, int start, int end) {

		return getPersistence().findByG_C(groupId, code, start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources where groupId = &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByG_C(
		long groupId, String code, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().findByG_C(
			groupId, code, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the calendar resources where groupId = &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByG_C(
		long groupId, String code, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_C(
			groupId, code, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first calendar resource in the ordered set where groupId = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByG_C_First(
			long groupId, String code,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByG_C_First(
			groupId, code, orderByComparator);
	}

	/**
	 * Returns the first calendar resource in the ordered set where groupId = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByG_C_First(
		long groupId, String code,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByG_C_First(
			groupId, code, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where groupId = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByG_C_Last(
			long groupId, String code,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByG_C_Last(
			groupId, code, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where groupId = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByG_C_Last(
		long groupId, String code,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByG_C_Last(
			groupId, code, orderByComparator);
	}

	/**
	 * Returns the calendar resources before and after the current calendar resource in the ordered set where groupId = &#63; and code = &#63;.
	 *
	 * @param calendarResourceId the primary key of the current calendar resource
	 * @param groupId the group ID
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next calendar resource
	 * @throws NoSuchResourceException if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource[] findByG_C_PrevAndNext(
			long calendarResourceId, long groupId, String code,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByG_C_PrevAndNext(
			calendarResourceId, groupId, code, orderByComparator);
	}

	/**
	 * Returns all the calendar resources that the user has permission to view where groupId = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the matching calendar resources that the user has permission to view
	 */
	public static List<CalendarResource> filterFindByG_C(
		long groupId, String code) {

		return getPersistence().filterFindByG_C(groupId, code);
	}

	/**
	 * Returns a range of all the calendar resources that the user has permission to view where groupId = &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of matching calendar resources that the user has permission to view
	 */
	public static List<CalendarResource> filterFindByG_C(
		long groupId, String code, int start, int end) {

		return getPersistence().filterFindByG_C(groupId, code, start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources that the user has permissions to view where groupId = &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendar resources that the user has permission to view
	 */
	public static List<CalendarResource> filterFindByG_C(
		long groupId, String code, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().filterFindByG_C(
			groupId, code, start, end, orderByComparator);
	}

	/**
	 * Returns the calendar resources before and after the current calendar resource in the ordered set of calendar resources that the user has permission to view where groupId = &#63; and code = &#63;.
	 *
	 * @param calendarResourceId the primary key of the current calendar resource
	 * @param groupId the group ID
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next calendar resource
	 * @throws NoSuchResourceException if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource[] filterFindByG_C_PrevAndNext(
			long calendarResourceId, long groupId, String code,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().filterFindByG_C_PrevAndNext(
			calendarResourceId, groupId, code, orderByComparator);
	}

	/**
	 * Returns all the calendar resources that the user has permission to view where groupId = any &#63; and code = &#63;.
	 *
	 * @param groupIds the group IDs
	 * @param code the code
	 * @return the matching calendar resources that the user has permission to view
	 */
	public static List<CalendarResource> filterFindByG_C(
		long[] groupIds, String code) {

		return getPersistence().filterFindByG_C(groupIds, code);
	}

	/**
	 * Returns a range of all the calendar resources that the user has permission to view where groupId = any &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupIds the group IDs
	 * @param code the code
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of matching calendar resources that the user has permission to view
	 */
	public static List<CalendarResource> filterFindByG_C(
		long[] groupIds, String code, int start, int end) {

		return getPersistence().filterFindByG_C(groupIds, code, start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources that the user has permission to view where groupId = any &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupIds the group IDs
	 * @param code the code
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendar resources that the user has permission to view
	 */
	public static List<CalendarResource> filterFindByG_C(
		long[] groupIds, String code, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().filterFindByG_C(
			groupIds, code, start, end, orderByComparator);
	}

	/**
	 * Returns all the calendar resources where groupId = any &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupIds the group IDs
	 * @param code the code
	 * @return the matching calendar resources
	 */
	public static List<CalendarResource> findByG_C(
		long[] groupIds, String code) {

		return getPersistence().findByG_C(groupIds, code);
	}

	/**
	 * Returns a range of all the calendar resources where groupId = any &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupIds the group IDs
	 * @param code the code
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of matching calendar resources
	 */
	public static List<CalendarResource> findByG_C(
		long[] groupIds, String code, int start, int end) {

		return getPersistence().findByG_C(groupIds, code, start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources where groupId = any &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupIds the group IDs
	 * @param code the code
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByG_C(
		long[] groupIds, String code, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().findByG_C(
			groupIds, code, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the calendar resources where groupId = &#63; and code = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupIds the group IDs
	 * @param code the code
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByG_C(
		long[] groupIds, String code, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_C(
			groupIds, code, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the calendar resources where groupId = &#63; and code = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 */
	public static void removeByG_C(long groupId, String code) {
		getPersistence().removeByG_C(groupId, code);
	}

	/**
	 * Returns the number of calendar resources where groupId = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the number of matching calendar resources
	 */
	public static int countByG_C(long groupId, String code) {
		return getPersistence().countByG_C(groupId, code);
	}

	/**
	 * Returns the number of calendar resources where groupId = any &#63; and code = &#63;.
	 *
	 * @param groupIds the group IDs
	 * @param code the code
	 * @return the number of matching calendar resources
	 */
	public static int countByG_C(long[] groupIds, String code) {
		return getPersistence().countByG_C(groupIds, code);
	}

	/**
	 * Returns the number of calendar resources that the user has permission to view where groupId = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the number of matching calendar resources that the user has permission to view
	 */
	public static int filterCountByG_C(long groupId, String code) {
		return getPersistence().filterCountByG_C(groupId, code);
	}

	/**
	 * Returns the number of calendar resources that the user has permission to view where groupId = any &#63; and code = &#63;.
	 *
	 * @param groupIds the group IDs
	 * @param code the code
	 * @return the number of matching calendar resources that the user has permission to view
	 */
	public static int filterCountByG_C(long[] groupIds, String code) {
		return getPersistence().filterCountByG_C(groupIds, code);
	}

	/**
	 * Returns all the calendar resources where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the matching calendar resources
	 */
	public static List<CalendarResource> findByG_A(
		long groupId, boolean active) {

		return getPersistence().findByG_A(groupId, active);
	}

	/**
	 * Returns a range of all the calendar resources where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of matching calendar resources
	 */
	public static List<CalendarResource> findByG_A(
		long groupId, boolean active, int start, int end) {

		return getPersistence().findByG_A(groupId, active, start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByG_A(
		long groupId, boolean active, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().findByG_A(
			groupId, active, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the calendar resources where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByG_A(
		long groupId, boolean active, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_A(
			groupId, active, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first calendar resource in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByG_A_First(
			long groupId, boolean active,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByG_A_First(
			groupId, active, orderByComparator);
	}

	/**
	 * Returns the first calendar resource in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByG_A_First(
		long groupId, boolean active,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByG_A_First(
			groupId, active, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByG_A_Last(
			long groupId, boolean active,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByG_A_Last(
			groupId, active, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByG_A_Last(
		long groupId, boolean active,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByG_A_Last(
			groupId, active, orderByComparator);
	}

	/**
	 * Returns the calendar resources before and after the current calendar resource in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param calendarResourceId the primary key of the current calendar resource
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next calendar resource
	 * @throws NoSuchResourceException if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource[] findByG_A_PrevAndNext(
			long calendarResourceId, long groupId, boolean active,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByG_A_PrevAndNext(
			calendarResourceId, groupId, active, orderByComparator);
	}

	/**
	 * Returns all the calendar resources that the user has permission to view where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the matching calendar resources that the user has permission to view
	 */
	public static List<CalendarResource> filterFindByG_A(
		long groupId, boolean active) {

		return getPersistence().filterFindByG_A(groupId, active);
	}

	/**
	 * Returns a range of all the calendar resources that the user has permission to view where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of matching calendar resources that the user has permission to view
	 */
	public static List<CalendarResource> filterFindByG_A(
		long groupId, boolean active, int start, int end) {

		return getPersistence().filterFindByG_A(groupId, active, start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources that the user has permissions to view where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendar resources that the user has permission to view
	 */
	public static List<CalendarResource> filterFindByG_A(
		long groupId, boolean active, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().filterFindByG_A(
			groupId, active, start, end, orderByComparator);
	}

	/**
	 * Returns the calendar resources before and after the current calendar resource in the ordered set of calendar resources that the user has permission to view where groupId = &#63; and active = &#63;.
	 *
	 * @param calendarResourceId the primary key of the current calendar resource
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next calendar resource
	 * @throws NoSuchResourceException if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource[] filterFindByG_A_PrevAndNext(
			long calendarResourceId, long groupId, boolean active,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().filterFindByG_A_PrevAndNext(
			calendarResourceId, groupId, active, orderByComparator);
	}

	/**
	 * Removes all the calendar resources where groupId = &#63; and active = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 */
	public static void removeByG_A(long groupId, boolean active) {
		getPersistence().removeByG_A(groupId, active);
	}

	/**
	 * Returns the number of calendar resources where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the number of matching calendar resources
	 */
	public static int countByG_A(long groupId, boolean active) {
		return getPersistence().countByG_A(groupId, active);
	}

	/**
	 * Returns the number of calendar resources that the user has permission to view where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the number of matching calendar resources that the user has permission to view
	 */
	public static int filterCountByG_A(long groupId, boolean active) {
		return getPersistence().filterCountByG_A(groupId, active);
	}

	/**
	 * Returns the calendar resource where classNameId = &#63; and classPK = &#63; or throws a <code>NoSuchResourceException</code> if it could not be found.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByC_C(long classNameId, long classPK)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByC_C(classNameId, classPK);
	}

	/**
	 * Returns the calendar resource where classNameId = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByC_C(long classNameId, long classPK) {
		return getPersistence().fetchByC_C(classNameId, classPK);
	}

	/**
	 * Returns the calendar resource where classNameId = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByC_C(
		long classNameId, long classPK, boolean useFinderCache) {

		return getPersistence().fetchByC_C(
			classNameId, classPK, useFinderCache);
	}

	/**
	 * Removes the calendar resource where classNameId = &#63; and classPK = &#63; from the database.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the calendar resource that was removed
	 */
	public static CalendarResource removeByC_C(long classNameId, long classPK)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().removeByC_C(classNameId, classPK);
	}

	/**
	 * Returns the number of calendar resources where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the number of matching calendar resources
	 */
	public static int countByC_C(long classNameId, long classPK) {
		return getPersistence().countByC_C(classNameId, classPK);
	}

	/**
	 * Returns all the calendar resources where companyId = &#63; and code LIKE &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param code the code
	 * @param active the active
	 * @return the matching calendar resources
	 */
	public static List<CalendarResource> findByC_LikeC_A(
		long companyId, String code, boolean active) {

		return getPersistence().findByC_LikeC_A(companyId, code, active);
	}

	/**
	 * Returns a range of all the calendar resources where companyId = &#63; and code LIKE &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param code the code
	 * @param active the active
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of matching calendar resources
	 */
	public static List<CalendarResource> findByC_LikeC_A(
		long companyId, String code, boolean active, int start, int end) {

		return getPersistence().findByC_LikeC_A(
			companyId, code, active, start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources where companyId = &#63; and code LIKE &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param code the code
	 * @param active the active
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByC_LikeC_A(
		long companyId, String code, boolean active, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().findByC_LikeC_A(
			companyId, code, active, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the calendar resources where companyId = &#63; and code LIKE &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param code the code
	 * @param active the active
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching calendar resources
	 */
	public static List<CalendarResource> findByC_LikeC_A(
		long companyId, String code, boolean active, int start, int end,
		OrderByComparator<CalendarResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByC_LikeC_A(
			companyId, code, active, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first calendar resource in the ordered set where companyId = &#63; and code LIKE &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param code the code
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByC_LikeC_A_First(
			long companyId, String code, boolean active,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByC_LikeC_A_First(
			companyId, code, active, orderByComparator);
	}

	/**
	 * Returns the first calendar resource in the ordered set where companyId = &#63; and code LIKE &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param code the code
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByC_LikeC_A_First(
		long companyId, String code, boolean active,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByC_LikeC_A_First(
			companyId, code, active, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where companyId = &#63; and code LIKE &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param code the code
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource
	 * @throws NoSuchResourceException if a matching calendar resource could not be found
	 */
	public static CalendarResource findByC_LikeC_A_Last(
			long companyId, String code, boolean active,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByC_LikeC_A_Last(
			companyId, code, active, orderByComparator);
	}

	/**
	 * Returns the last calendar resource in the ordered set where companyId = &#63; and code LIKE &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param code the code
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching calendar resource, or <code>null</code> if a matching calendar resource could not be found
	 */
	public static CalendarResource fetchByC_LikeC_A_Last(
		long companyId, String code, boolean active,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().fetchByC_LikeC_A_Last(
			companyId, code, active, orderByComparator);
	}

	/**
	 * Returns the calendar resources before and after the current calendar resource in the ordered set where companyId = &#63; and code LIKE &#63; and active = &#63;.
	 *
	 * @param calendarResourceId the primary key of the current calendar resource
	 * @param companyId the company ID
	 * @param code the code
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next calendar resource
	 * @throws NoSuchResourceException if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource[] findByC_LikeC_A_PrevAndNext(
			long calendarResourceId, long companyId, String code,
			boolean active,
			OrderByComparator<CalendarResource> orderByComparator)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByC_LikeC_A_PrevAndNext(
			calendarResourceId, companyId, code, active, orderByComparator);
	}

	/**
	 * Removes all the calendar resources where companyId = &#63; and code LIKE &#63; and active = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param code the code
	 * @param active the active
	 */
	public static void removeByC_LikeC_A(
		long companyId, String code, boolean active) {

		getPersistence().removeByC_LikeC_A(companyId, code, active);
	}

	/**
	 * Returns the number of calendar resources where companyId = &#63; and code LIKE &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param code the code
	 * @param active the active
	 * @return the number of matching calendar resources
	 */
	public static int countByC_LikeC_A(
		long companyId, String code, boolean active) {

		return getPersistence().countByC_LikeC_A(companyId, code, active);
	}

	/**
	 * Caches the calendar resource in the entity cache if it is enabled.
	 *
	 * @param calendarResource the calendar resource
	 */
	public static void cacheResult(CalendarResource calendarResource) {
		getPersistence().cacheResult(calendarResource);
	}

	/**
	 * Caches the calendar resources in the entity cache if it is enabled.
	 *
	 * @param calendarResources the calendar resources
	 */
	public static void cacheResult(List<CalendarResource> calendarResources) {
		getPersistence().cacheResult(calendarResources);
	}

	/**
	 * Creates a new calendar resource with the primary key. Does not add the calendar resource to the database.
	 *
	 * @param calendarResourceId the primary key for the new calendar resource
	 * @return the new calendar resource
	 */
	public static CalendarResource create(long calendarResourceId) {
		return getPersistence().create(calendarResourceId);
	}

	/**
	 * Removes the calendar resource with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param calendarResourceId the primary key of the calendar resource
	 * @return the calendar resource that was removed
	 * @throws NoSuchResourceException if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource remove(long calendarResourceId)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().remove(calendarResourceId);
	}

	public static CalendarResource updateImpl(
		CalendarResource calendarResource) {

		return getPersistence().updateImpl(calendarResource);
	}

	/**
	 * Returns the calendar resource with the primary key or throws a <code>NoSuchResourceException</code> if it could not be found.
	 *
	 * @param calendarResourceId the primary key of the calendar resource
	 * @return the calendar resource
	 * @throws NoSuchResourceException if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource findByPrimaryKey(long calendarResourceId)
		throws com.liferay.calendar.exception.NoSuchResourceException {

		return getPersistence().findByPrimaryKey(calendarResourceId);
	}

	/**
	 * Returns the calendar resource with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param calendarResourceId the primary key of the calendar resource
	 * @return the calendar resource, or <code>null</code> if a calendar resource with the primary key could not be found
	 */
	public static CalendarResource fetchByPrimaryKey(long calendarResourceId) {
		return getPersistence().fetchByPrimaryKey(calendarResourceId);
	}

	/**
	 * Returns all the calendar resources.
	 *
	 * @return the calendar resources
	 */
	public static List<CalendarResource> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the calendar resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @return the range of calendar resources
	 */
	public static List<CalendarResource> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the calendar resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of calendar resources
	 */
	public static List<CalendarResource> findAll(
		int start, int end,
		OrderByComparator<CalendarResource> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the calendar resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CalendarResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of calendar resources
	 * @param end the upper bound of the range of calendar resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of calendar resources
	 */
	public static List<CalendarResource> findAll(
		int start, int end,
		OrderByComparator<CalendarResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the calendar resources from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of calendar resources.
	 *
	 * @return the number of calendar resources
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CalendarResourcePersistence getPersistence() {
		return _persistence;
	}

	private static volatile CalendarResourcePersistence _persistence;

}