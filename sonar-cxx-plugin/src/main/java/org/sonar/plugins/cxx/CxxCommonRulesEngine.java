/*
 * Sonar C++ Plugin (Community)
 * Copyright (C) 2010 Neticoa SAS France
 * sonarqube@googlegroups.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.cxx;

import org.sonar.squidbridge.commonrules.api.CommonRulesEngine; //@todo deprecated
import org.sonar.squidbridge.commonrules.api.CommonRulesRepository; //@todo deprecated

public class CxxCommonRulesEngine extends CommonRulesEngine {

  public CxxCommonRulesEngine() {
    super(CxxLanguage.KEY);
  }

  @Override
  protected void doEnableRules(CommonRulesRepository repository) {
    repository
      .enableDuplicatedBlocksRule()
      .enableSkippedUnitTestsRule()
      .enableFailedUnitTestsRule()
      // null parameters -> keep default values as hardcoded in sonar-common-rules
      .enableInsufficientBranchCoverageRule(null)
      .enableInsufficientCommentDensityRule(null)
      .enableInsufficientLineCoverageRule(null);
  }
}
