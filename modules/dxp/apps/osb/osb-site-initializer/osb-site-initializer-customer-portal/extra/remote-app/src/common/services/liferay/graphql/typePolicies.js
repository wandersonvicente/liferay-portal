/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 */

import {accountSubscriptionTypePolicy} from '../../../../routes/customer-portal/pages/Project/Overview/components/SubscriptionsOverview/queries/typePolicy';
import {accountSubscriptionGroupsTypePolicy} from './account-subscription-groups/typePolicy';
import {
	koroneikiAccountsQueryTypePolicy,
	koroneikiAccountsTypePolicy,
} from './koroneiki-accounts/typePolicy';
import {userAccountsTypePolicy} from './user-accounts/typePolicy';

export const liferayTypePolicies = {
	...userAccountsTypePolicy,
	...koroneikiAccountsTypePolicy,
	...accountSubscriptionTypePolicy,
	...accountSubscriptionGroupsTypePolicy,
	Mutationc: {
		merge: true,
	},
	c: {
		fields: {
			...koroneikiAccountsQueryTypePolicy,
		},
		merge: true,
	},
};
