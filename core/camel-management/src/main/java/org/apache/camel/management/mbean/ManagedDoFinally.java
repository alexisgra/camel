/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.management.mbean;

import org.apache.camel.CamelContext;
import org.apache.camel.api.management.ManagedResource;
import org.apache.camel.api.management.mbean.ManagedDoFinallyMBean;
import org.apache.camel.model.FinallyDefinition;
import org.apache.camel.processor.FinallyProcessor;

@ManagedResource(description = "Managed DoFinally")
public class ManagedDoFinally extends ManagedProcessor implements ManagedDoFinallyMBean {

    public ManagedDoFinally(CamelContext context, FinallyProcessor processor, FinallyDefinition definition) {
        super(context, processor, definition);
    }

    @Override
    public FinallyDefinition getDefinition() {
        return (FinallyDefinition) super.getDefinition();
    }

}
