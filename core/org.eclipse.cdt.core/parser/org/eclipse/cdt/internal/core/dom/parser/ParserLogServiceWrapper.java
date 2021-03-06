/*******************************************************************************
 * Copyright (c) 2006, 2012 Wind River Systems, Inc. and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Markus Schorn - initial API and implementation
 *******************************************************************************/
package org.eclipse.cdt.internal.core.dom.parser;

import org.eclipse.cdt.core.parser.AbstractParserLogService;
import org.eclipse.cdt.core.parser.IParserLogService;

public class ParserLogServiceWrapper extends AbstractParserLogService {
	private IParserLogService fDelegate;

	public ParserLogServiceWrapper(IParserLogService log) {
		fDelegate = log;
	}

	@Override
	public boolean isTracing() {
		return fDelegate.isTracing();
	}

	@Override
	public void traceLog(String message) {
		fDelegate.traceLog(message);
	}
}
