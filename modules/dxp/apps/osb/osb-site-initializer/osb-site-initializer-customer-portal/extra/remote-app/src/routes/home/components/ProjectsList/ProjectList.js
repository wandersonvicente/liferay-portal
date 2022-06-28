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

import ClayLoadingIndicator from '@clayui/loading-indicator';
import classNames from 'classnames';
import {useEffect} from 'react';
import i18n from '../../../../common/I18n';
import ProjectCard from './components/ProjectCard';
import useIntersectionObserver from './hooks/useIntersectionObserver';

const THRESHOLD_COUNT = 4;

const getLoadingCards = () =>
	[...new Array(THRESHOLD_COUNT)].map((_, index) => (
		<ProjectCard key={index} loading />
	));

const ProjectList = ({
	fetching,
	hasManyProjects,
	koroneikiAccounts,
	loading,
	onIntersect,
}) => {
	const [setTrackedRefCurrent, isIntersecting] = useIntersectionObserver();

	const isLastPage = koroneikiAccounts?.page === koroneikiAccounts?.lastPage;
	const allowFetching = !isLastPage && !fetching;

	useEffect(() => {
		if (isIntersecting && allowFetching) {
			onIntersect(koroneikiAccounts?.page);
		}
	}, [isIntersecting, koroneikiAccounts?.page, onIntersect, allowFetching]);

	const getProjects = () => {
		return koroneikiAccounts?.items.map((koroneikiAccount, index) => (
			<ProjectCard
				compressed={hasManyProjects}
				key={`${koroneikiAccount.accountKey}-${index}`}
				{...koroneikiAccount}
			/>
		));
	};

	const showResults = () => {
		if (!koroneikiAccounts) {
			return (
				<p className="mx-auto">
					{i18n.translate('sorry-there-are-no-results-found')}
				</p>
			);
		}

		if (koroneikiAccounts.totalCount) {
			return (
				<>
					{getProjects()}
					{allowFetching && (
						<div className="mx-auto" ref={setTrackedRefCurrent}>
							<ClayLoadingIndicator small />
						</div>
					)}
				</>
			);
		}

		return (
			<p className="mx-auto">
				{i18n.translate('no-projects-match-these-criteria')}
			</p>
		);
	};

	return (
		<div
			className={classNames('d-flex flex-wrap', {
				'cp-home-projects px-5': !hasManyProjects,
				'cp-home-projects-sm pt-2': hasManyProjects,
			})}
		>
			{loading ? getLoadingCards() : showResults()}
		</div>
	);
};

export default ProjectList;
