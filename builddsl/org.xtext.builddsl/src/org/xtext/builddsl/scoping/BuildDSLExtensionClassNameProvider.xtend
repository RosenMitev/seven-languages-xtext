package org.xtext.builddsl.scoping

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider$ExtensionClassNameProvider
import java.io.File
import org.xtext.builddsl.lib.FileExtensions
import org.xtext.builddsl.lib.ClassExtensions

/** 
 * Add more static extension classes. 
 */
class BuildDSLExtensionClassNameProvider extends ExtensionClassNameProvider {

	override simpleComputeExtensionClasses() {
		super.simpleComputeExtensionClasses => [
			put(typeof(File), typeof(FileExtensions))
			put(typeof(String), typeof(FileExtensions))
			put(typeof(Class), typeof(ClassExtensions))
		]
	}

}