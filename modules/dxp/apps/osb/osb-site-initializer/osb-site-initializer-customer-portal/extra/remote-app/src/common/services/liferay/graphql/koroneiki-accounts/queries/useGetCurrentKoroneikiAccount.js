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

import {gql, useQuery} from '@apollo/client';
import {useMemo} from 'react';
import useHash from '../../../../../hooks/useHash';
import {OPERATION_TYPES} from '../../../../../utils/constants';

const GET_KORONEIKI_ACCOUNT_BY_EXTERNAL_REFERENCE_CODE = gql`
	query getKoroneikiAccountByExternalReferenceCode(
		$externalRefereceCode: String
	) {
		koroneikiAccount(externalRefereceCode: $externalRefereceCode)
			@rest(
				type: "C_KoroneikiAccount"
				path: "/c/koroneikiaccounts/by-external-reference-code/{args.externalRefereceCode}"
			) {
			accountKey
			code
			dxpVersion
			liferayContactEmailAddress
			liferayContactName
			liferayContactRole
			maxRequestors
			name
			partner
			region
			slaCurrent
			slaCurrentEndDate
			slaCurrentStartDate
			slaExpired
			slaExpiredEndDate
			slaExpiredStartDate
			slaFuture
			slaFutureEndDate
			slaFutureStartDate
			status @client
		}
	}
`;

export default function useGetCurrentKoroneikiAccount(
	options = {
		notifyOnNetworkStatusChange: false,
		skip: false,
	}
) {
	const hashLocation = useHash();
	const accountKey = useMemo(
		() => hashLocation.replace('#/', '').split('/').filter(Boolean)[0],
		[hashLocation]
	);

	return useQuery(GET_KORONEIKI_ACCOUNT_BY_EXTERNAL_REFERENCE_CODE, {
		context: {
			type: OPERATION_TYPES.liferayRest,
		},
		notifyOnNetworkStatusChange: options.notifyOnNetworkStatusChange,
		skip: options.skip,
		variables: {
			externalRefereceCode: accountKey,
		},
	});
}
