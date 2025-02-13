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

package com.liferay.portal.workflow;

import com.liferay.portal.kernel.messaging.proxy.BaseProxyBean;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.WorkflowException;
import com.liferay.portal.kernel.workflow.WorkflowTask;
import com.liferay.portal.kernel.workflow.WorkflowTaskManager;
import com.liferay.portal.kernel.workflow.WorkflowTransition;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Micha Kiener
 * @author Shuyang Zhou
 * @author Brian Wing Shun Chan
 * @author Marcellus Tavares
 */
@OSGiBeanProperties(
	property = "proxy.bean=true", service = WorkflowTaskManager.class
)
public class WorkflowTaskManagerProxyBean
	extends BaseProxyBean implements WorkflowTaskManager {

	@Override
	public WorkflowTask assignWorkflowTaskToRole(
		long companyId, long userId, long workflowTaskId, long roleId,
		String comment, Date dueDate,
		Map<String, Serializable> workflowContext) {

		throw new UnsupportedOperationException();
	}

	@Override
	public WorkflowTask assignWorkflowTaskToUser(
		long companyId, long userId, long workflowTaskId, long assigneeUserId,
		String comment, Date dueDate,
		Map<String, Serializable> workflowContext) {

		throw new UnsupportedOperationException();
	}

	@Override
	public WorkflowTask completeWorkflowTask(
		long companyId, long userId, long workflowTaskId, String transitionName,
		String comment, Map<String, Serializable> workflowContext) {

		throw new UnsupportedOperationException();
	}

	@Override
	public WorkflowTask fetchWorkflowTask(long workflowTaskId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<User> getAssignableUsers(long workflowTaskId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<String> getNextTransitionNames(
		long userId, long workflowTaskId) {

		throw new UnsupportedOperationException();
	}

	@Override
	public WorkflowTask getWorkflowTask(long workflowTaskId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getWorkflowTaskCount(long companyId, Boolean completed) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getWorkflowTaskCountByRole(
		long companyId, long roleId, Boolean completed) {

		throw new UnsupportedOperationException();
	}

	@Override
	public int getWorkflowTaskCountBySubmittingUser(
		long companyId, long userId, Boolean completed) {

		throw new UnsupportedOperationException();
	}

	@Override
	public int getWorkflowTaskCountByUser(
		long companyId, long userId, Boolean completed) {

		throw new UnsupportedOperationException();
	}

	@Override
	public int getWorkflowTaskCountByUserRoles(
		long companyId, long userId, Boolean completed) {

		throw new UnsupportedOperationException();
	}

	@Override
	public int getWorkflowTaskCountByUserRoles(
		long companyId, long userId, long workflowInstanceId,
		Boolean completed) {

		throw new UnsupportedOperationException();
	}

	@Override
	public int getWorkflowTaskCountByWorkflowInstance(
		long companyId, Long userId, long workflowInstanceId,
		Boolean completed) {

		throw new UnsupportedOperationException();
	}

	@Override
	public List<WorkflowTask> getWorkflowTasks(
		long companyId, Boolean completed, int start, int end,
		OrderByComparator<WorkflowTask> orderByComparator) {

		throw new UnsupportedOperationException();
	}

	@Override
	public List<WorkflowTask> getWorkflowTasksByRole(
		long companyId, long roleId, Boolean completed, int start, int end,
		OrderByComparator<WorkflowTask> orderByComparator) {

		throw new UnsupportedOperationException();
	}

	@Override
	public List<WorkflowTask> getWorkflowTasksBySubmittingUser(
		long companyId, long userId, Boolean completed, int start, int end,
		OrderByComparator<WorkflowTask> orderByComparator) {

		throw new UnsupportedOperationException();
	}

	@Override
	public List<WorkflowTask> getWorkflowTasksByUser(
		long companyId, long userId, Boolean completed, int start, int end,
		OrderByComparator<WorkflowTask> orderByComparator) {

		throw new UnsupportedOperationException();
	}

	@Override
	public List<WorkflowTask> getWorkflowTasksByUserRoles(
		long companyId, long userId, Boolean completed, int start, int end,
		OrderByComparator<WorkflowTask> orderByComparator) {

		throw new UnsupportedOperationException();
	}

	@Override
	public List<WorkflowTask> getWorkflowTasksByWorkflowInstance(
		long companyId, Long userId, long workflowInstanceId, Boolean completed,
		int start, int end, OrderByComparator<WorkflowTask> orderByComparator) {

		throw new UnsupportedOperationException();
	}

	@Override
	public List<WorkflowTransition> getWorkflowTaskWorkflowTransitions(
			long workflowTaskId)
		throws WorkflowException {

		throw new UnsupportedOperationException();
	}

	@Override
	public boolean hasAssignableUsers(long workflowTaskId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<WorkflowTask> search(
		long companyId, long userId, String assetTitle, String[] taskNames,
		String[] assetTypes, Long[] assetPrimaryKeys, String assigneeClassName,
		Long[] assigneeIds, Date dueDateGT, Date dueDateLT, Boolean completed,
		Boolean searchByUserRoles, Long workflowDefinitionId,
		Long[] workflowInstanceIds, Boolean andOperator, int start, int end,
		OrderByComparator<WorkflowTask> orderByComparator) {

		throw new UnsupportedOperationException();
	}

	@Override
	public int searchCount(
		long companyId, long userId, String assetTitle, String[] taskNames,
		String[] assetTypes, Long[] assetPrimaryKeys, String assigneeClassName,
		Long[] assigneeIds, Date dueDateGT, Date dueDateLT, Boolean completed,
		Boolean searchByUserRoles, Long workflowDefinitionId,
		Long[] workflowInstanceIds, Boolean andOperator) {

		throw new UnsupportedOperationException();
	}

	@Override
	public WorkflowTask updateDueDate(
		long companyId, long userId, long workflowTaskId, String comment,
		Date dueDate) {

		throw new UnsupportedOperationException();
	}

}