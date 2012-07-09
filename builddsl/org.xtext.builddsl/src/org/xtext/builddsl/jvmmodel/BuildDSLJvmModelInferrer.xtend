package org.xtext.builddsl.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.xtext.builddsl.build.BuildFile
import org.xtext.builddsl.build.Parameter
import org.xtext.builddsl.build.Task
import org.xtext.builddsl.lib.BuildScript

import static org.eclipse.xtext.common.types.TypesFactory.*
import org.xtext.builddsl.lib.Param
import org.xtext.builddsl.lib.DependsOn

/**
 * Infers a Java class from a {@link BuildFile} allowing to execute it.
 */
class BuildDSLJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject ITypeProvider typeProvider

   	def dispatch void infer(BuildFile file, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		val fqn = file.javaClassName
   		val scriptName = Strings::lastToken(fqn, ".")
   		acceptor.accept(file.toClass(fqn)).initializeLater [
			superTypes += file.newTypeRef(typeof(BuildScript))
			
			// parameters become Java fields
			for (declaredParameter : file.parameters) {
				val type = declaredParameter.type ?: typeProvider.getType(declaredParameter.init)
				members += declaredParameter.toField(declaredParameter.name, type) [
					visibility = JvmVisibility::PUBLIC
					annotations += declaredParameter.toAnnotation(typeof(Param))
					if (declaredParameter.init != null)
						initializer = declaredParameter.init
				]
			}
			
			// the main method		
   			val stringArray = file.newTypeRef(typeof(String)).addArrayTypeDimension
			members += file.toMethod("main", file.newTypeRef(Void::TYPE)) [
				it.parameters += toParameter("args", stringArray)
				^static = true
				body = [append('''
					«scriptName» script = new «scriptName»();
					if (script.showHelp(args)) {
						System.exit(HELP);
					}
					System.exit(script.doBuild(args));
				''')]
			]
			

			// a method for the actual task body
   			members += file.tasks.map[ task | toMethod(task.methodName, task.newTypeRef(Void::TYPE)) [
   				visibility = JvmVisibility::PROTECTED
   				annotations += task.toAnnotation(typeof(DependsOn)) => [
   					values += eINSTANCE.createJvmStringAnnotationValue => [
   						values += task.depends.map[name]
   					]
   				]
   				body = task.action
   			]]
   			
		]
   	}
   	
   	def private getTasks(BuildFile it) {
   		declarations.filter(typeof(Task))
   	}
   	
   	def private getParameters(BuildFile it) {
   		declarations.filter(typeof(Parameter))
   	}
   	
   	def private getMethodName(Task it) {
   		name
   	}
   	
   	def getJavaClassName(BuildFile it) {
		if (name == null)
			eResource.URI.trimFileExtension.lastSegment
		else
			name + "." + eResource.URI.trimFileExtension.lastSegment
	}
   	
}
