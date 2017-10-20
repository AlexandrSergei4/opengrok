/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * See LICENSE.txt included in this distribution for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at LICENSE.txt.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright (c) 2011, 2015, Oracle and/or its affiliates. All rights reserved.
 */

package org.opensolaris.opengrok.analysis.php;

import org.opensolaris.opengrok.analysis.FileAnalyzer;
import org.opensolaris.opengrok.analysis.FileAnalyzer.Genre;
import org.opensolaris.opengrok.analysis.FileAnalyzerFactory;

public class PhpAnalyzerFactory extends FileAnalyzerFactory {

    private static final String name = "PHP";
    
    private static final String[] SUFFIXES = {
        "PHP",
        "PHP3",
        "PHP4",
        "PHPS",
        "PHTML"
    };
    private static final String[] MAGICS = {
        "#!/usr/bin/env php",
        "#!/usr/bin/php",
        "#!/bin/php"
    };

    public PhpAnalyzerFactory() {
        super(null, null, SUFFIXES, MAGICS, null, "text/plain", Genre.PLAIN, name);
    }

    @Override
    protected FileAnalyzer newAnalyzer() {
        return new PhpAnalyzer(this);
    }
}
