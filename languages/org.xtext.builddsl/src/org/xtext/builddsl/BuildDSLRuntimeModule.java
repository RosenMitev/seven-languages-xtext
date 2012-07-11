/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl;

import org.eclipse.xtext.service.SingletonBinding;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;
import org.xtext.builddsl.scoping.AllImportsAreStaticFeatureProvider;
import org.xtext.builddsl.scoping.BuildDSLExtensionClassNameProvider;
import org.xtext.builddsl.validation.BuildDSLValidator;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class BuildDSLRuntimeModule extends org.xtext.builddsl.AbstractBuildDSLRuntimeModule {

	@SingletonBinding(eager = true)
	public Class<? extends BuildDSLValidator> bindValidator() {
		return BuildDSLValidator.class;
	}

	public Class<? extends ExtensionClassNameProvider> bindExtensionClassNameProvider() {
		return BuildDSLExtensionClassNameProvider.class;
	}
	
	public Class<? extends StaticImplicitMethodsFeatureForTypeProvider> bindStaticImplicitMethodsFeatureForTypeProvider() {
		return AllImportsAreStaticFeatureProvider.class;
	}
	
}
