/*-
 * #%L
 * Bobcat
 * %%
 * Copyright (C) 2016 Cognifide Ltd.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.cognifide.qa.bb.dsl.implementations;

import com.cognifide.qa.bb.dsl.interfaces.Path;
import com.cognifide.qa.bb.dsl.interfaces.Query;
import com.cognifide.qa.bb.page.Page;

public class PathImpl extends Condition implements Path {

  public PathImpl(Page page) {
    super(page);
  }

  @Override
  public Query path(String path) {
    page.setPath(path);
    return new QueryImpl(page);
  }
}