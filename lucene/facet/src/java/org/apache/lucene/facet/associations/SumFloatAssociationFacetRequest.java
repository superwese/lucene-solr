package org.apache.lucene.facet.associations;

import org.apache.lucene.facet.params.FacetIndexingParams;
import org.apache.lucene.facet.search.FacetRequest;
import org.apache.lucene.facet.search.FacetsAggregator;
import org.apache.lucene.facet.taxonomy.CategoryPath;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A {@link FacetRequest} for weighting facets according to their float
 * association by summing the association values.
 * 
 * @lucene.experimental
 */
public class SumFloatAssociationFacetRequest extends FacetRequest {

  /**
   * Create a float association facet request for a given node in the
   * taxonomy.
   */
  public SumFloatAssociationFacetRequest(CategoryPath path, int num) {
    super(path, num);
  }

  @Override
  public FacetsAggregator createFacetsAggregator(FacetIndexingParams fip) {
    return new SumFloatAssociationFacetsAggregator();
  }
  
}
