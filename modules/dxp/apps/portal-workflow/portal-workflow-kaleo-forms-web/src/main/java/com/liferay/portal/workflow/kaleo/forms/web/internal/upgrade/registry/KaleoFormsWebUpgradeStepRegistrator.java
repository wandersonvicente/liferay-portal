/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.portal.workflow.kaleo.forms.web.internal.upgrade.registry;

import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;
import com.liferay.portal.workflow.kaleo.forms.web.internal.upgrade.v1_0_2.UpgradePortletId;
import com.liferay.portal.workflow.kaleo.forms.web.internal.upgrade.v1_0_3.UpgradeLayoutTypeSettings;

import org.osgi.service.component.annotations.Component;

/**
 * @author Marcellus Tavares
 */
@Component(service = UpgradeStepRegistrator.class)
public class KaleoFormsWebUpgradeStepRegistrator
	implements UpgradeStepRegistrator {

	@Override
	public void register(Registry registry) {
		registry.registerInitialization();

		registry.register("0.0.1", "1.0.2", new UpgradePortletId());

		registry.register("1.0.2", "1.0.3", new UpgradeLayoutTypeSettings());
	}

}