package org.xtext.builddsl

import java.util.Collection
import java.util.Set
import org.xtext.builddsl.build.Task

import static org.xtext.builddsl.TaskExtensions.*
import org.xtext.builddsl.build.BuildFile

class TaskExtensions {
	
	def static Collection<Task> findDependentTasks(Task it) {
		findDependentTasks(it, null)
	}
	
	def static Collection<Task> findDependentTasks(Task it, (Set<Task>) => void cycleHandler) {
		
		// 1. collect all tasks that we depend on
		val tasks = <Task>newLinkedHashSet
		internalFindDependentTasks(it, tasks)
		
		// 2. sort them so that dependents come after dependees  
		val result = <Task>newLinkedHashSet
		var changed = true
		while(changed) {
			changed = false
			for(t:tasks.toList) 
				if(result.containsAll(t.depends)) {
					changed = true
					result.add(t)
					tasks.remove(t)
				}
		}
		if(!tasks.empty && cycleHandler != null)
			cycleHandler.apply(tasks)
		result
	}
	
	def private static void internalFindDependentTasks(Task task, Set<Task> set) {
		if (!set.add(task))
			return;
		for (t : task.depends) 
			internalFindDependentTasks(t, set)
	}
	
	def static getJavaClassName(BuildFile file) {
		if(file.name == null)
			file.eResource.URI.trimFileExtension.lastSegment
		else
			file.name + "." + file.eResource.URI.trimFileExtension.lastSegment
	}
}