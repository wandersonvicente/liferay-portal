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

import ClayCard from '@clayui/card';
import ClayLabel from '@clayui/label';
import classNames from 'classnames';
import React from 'react';
import i18n from '../../../../../../../../../../../common/I18n';
import {SLA_TYPES} from '../../../../../../../../../../../common/utils/constants';

const SlaCard = ({endDate, label, selected, startDate, title}) => {
	const slaDate = `${startDate} - ${endDate}`;

	return (
		<div
			className={classNames('align-items-center d-flex', {
				'cp-sla-card': !selected,
				'cp-sla-card-active': selected,
			})}
		>
			<ClayCard
				className={classNames(
					'm-0 p-3 rounded-lg border cp-sla-min-width',
					{
						'bg-brand-secondary-lighten-6 border-brand-secondary-lighten-4':
							title === SLA_TYPES.gold,
						'bg-neutral-0 border-brand-primary-darken-2 ':
							title === SLA_TYPES.limited,
						'bg-neutral-0 border-neutral-2 ':
							title === SLA_TYPES.platinum,
						'border-brand-primary-lighten-3 bg-brand-primary-lighten-5':
							title === SLA_TYPES.premium,
					}
				)}
			>
				<ClayCard.Row className="align-items-center d-flex justify-content-between">
					<div
						className={classNames('h5 mb-0', {
							'text-brand-primary-darken-2':
								title === SLA_TYPES.limited,
							'text-brand-primary-lighten-1':
								title === SLA_TYPES.premium,
							'text-brand-secondary-darken-3':
								title === SLA_TYPES.gold,
							'text-neutral-7': title === SLA_TYPES.platinum,
						})}
					>
						{i18n.translate(title)}
					</div>

					<div>
						<ClayCard.Caption>
							<ClayLabel
								className={classNames(
									'mr-0 p-0 text-small-caps cp-sla-label',
									{
										'label-borderless-dark text-neutral-7':
											title === SLA_TYPES.platinum,
										'label-borderless-primary text-brand-primary-darken-2':
											title === SLA_TYPES.limited,
										'label-borderless-secondary text-brand-primary-lighten-1':
											title === SLA_TYPES.premium,
										'label-borderless-secondary text-brand-secondary-darken-3':
											title === SLA_TYPES.gold,
									}
								)}
								displayType="secundary"
							>
								{i18n.translate(label).toUpperCase()}
							</ClayLabel>
						</ClayCard.Caption>
					</div>
				</ClayCard.Row>

				<ClayCard.Description
					className={classNames('', {
						'text-brand-primary-darken-2':
							title === SLA_TYPES.limited,
						'text-brand-primary-lighten-1':
							title === SLA_TYPES.premium,
						'text-brand-secondary-darken-3':
							title === SLA_TYPES.gold,
						'text-neutral-6': title === SLA_TYPES.platinum,
					})}
					displayType="text"
					truncate={false}
				>
					{slaDate}
				</ClayCard.Description>
			</ClayCard>
		</div>
	);
};

export default SlaCard;
