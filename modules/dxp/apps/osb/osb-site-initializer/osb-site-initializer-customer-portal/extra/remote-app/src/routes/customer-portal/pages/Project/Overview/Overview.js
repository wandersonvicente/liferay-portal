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

import './app.scss';
// eslint-disable-next-line no-unused-vars
import useGetCurrentKoroneikiAccount from '../../../../../common/services/liferay/graphql/koroneiki-accounts/queries/useGetCurrentKoroneikiAccount';
import SubscriptionsOverview from './components/SubscriptionsOverview';

const Overview = () => {
	// const {data, loading} = useGetCurrentKoroneikiAccount();

	// eslint-disable-next-line no-console
	// console.log(data, loading);

	return (
		<>
			<SubscriptionsOverview />
		</>
	);
};

export default Overview;
