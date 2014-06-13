/*******************************************************************************
 * Copyright (c) 2013 Igor Fedorenko
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Igor Fedorenko - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2e.core.internal.equinox;

/**
 * Facade that provides Equinox development classpath information.
 * 
 * @since 1.5
 */
@SuppressWarnings("restriction")
public class DevClassPathHelper {

  public static String[] getDevClassPath(String bundleSymbolicName) {
    return org.eclipse.core.internal.runtime.DevClassPathHelper.getDevClassPath(bundleSymbolicName);
  }

  public static boolean inDevelopmentMode() {
    return org.eclipse.core.internal.runtime.DevClassPathHelper.inDevelopmentMode();
  }
}
