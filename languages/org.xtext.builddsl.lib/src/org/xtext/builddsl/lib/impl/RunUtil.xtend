/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.lib.impl

import static java.util.Collections.*

class RunUtil {
	
	def static void runMain(Class<?> clazz, String[] argument) {
		val mainMethod = clazz.getDeclaredMethod("main", Class::forName('[Ljava.lang.String;'))
		val Object[] args = singletonList(argument as Object) 
		mainMethod.invoke(null, args)
	}

}