/*
 *
 *
 * Copyright 2017 Symphony Communication Services, LLC.
 *
 * Licensed to The Symphony Software Foundation (SSF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The SSF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.symphonyoss.symphony.entityjson;

/**
 * Builder for EntityJsonParser.
 * 
 * Fluent interface.
 * 
 * @author Bruce Skingle
 *
 */
public class EntityJsonParserBuilder
{
  private boolean unrestrictedSchemaLoad_;
    
  public boolean isUnrestrictedSchemaLoad()
  {
    return unrestrictedSchemaLoad_;
  }
  
  /**
   * Set schema loading behavior. By default referenced schemas will only be loaded from known
   * hosts. Setting this parameter to true allows referenced schemas to be loaded from anywhere.
   * 
   * @param unrestrictedSchemaLoad  Allow schema loading from unknown hosts.
   * @return this (fluent interface)
   */
  public EntityJsonParserBuilder withUnrestrictedSchemaLoad(boolean unrestrictedSchemaLoad)
  {
    unrestrictedSchemaLoad_ = unrestrictedSchemaLoad;
    return this;
  }
  
  /**
   * Create a parser from the current state of this builder.
   * 
   * @return and EntityJsonParser.
   */
  EntityJsonParser  build()
  {
    return new EntityJsonParser(unrestrictedSchemaLoad_);
  }
}
