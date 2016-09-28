/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.    
 */
package org.apache.bval.bench.metatree;

import java.util.Set;
import com.google.common.collect.Sets;
import com.sun.codemodel.JFieldVar;


/**
 * Wraps a {@link JFieldVar}.
 * 
 * @author Carlos Vara
 */
public abstract class AbstractMetaField implements Annotable {

    // The wrapped field
    protected JFieldVar generatedField;

    // The set of annotations for this field
    protected Set<MetaAnnotation> annotations = Sets.newHashSet();

    // The name of the field
    private String name;
    
    // The owner of this field
    private MetaJavaBean owner;

    public AbstractMetaField(MetaJavaBean owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    public JFieldVar getGeneratedField() {
        return generatedField;
    }

    public String getName() {
        return name;
    }
    
    public MetaJavaBean getOwner() {
        return owner;
    }

}
