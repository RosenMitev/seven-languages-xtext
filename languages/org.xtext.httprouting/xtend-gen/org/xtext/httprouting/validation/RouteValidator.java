/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.httprouting.validation;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator;

@SuppressWarnings("all")
public class RouteValidator extends XbaseWithAnnotationsJavaValidator {
  /**
   * disable this check
   */
  protected boolean isImplicitReturn(final XExpression expr) {
    return false;
  }
}
