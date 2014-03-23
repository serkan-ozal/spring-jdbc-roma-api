/*
 * Copyright 2002-2013 the original author or authors.
 *
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
 */

package org.springframework.jdbc.roma.api.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Serkan ÖZAL
 */
public class DefaultConfigs {

	private String defaultDataSourceName = "dataSource";
	private String defaultSchemaName = null;
	@SuppressWarnings("rawtypes")
	private Class<? extends List> defaultListImplementationClass = ArrayList.class;
	@SuppressWarnings("rawtypes")
	private Class<? extends Set> defaultSetImplementationClass = HashSet.class;
	@SuppressWarnings("rawtypes")
	private Class<? extends Map> defaultMapImplementationClass = HashMap.class;
	
	public String getDefaultDataSourceName() {
		return defaultDataSourceName;
	}
	
	public void setDefaultDataSourceName(String defaultDataSourceName) {
		this.defaultDataSourceName = defaultDataSourceName;
	}
	
	public String getDefaultSchemaName() {
		return defaultSchemaName;
	}
	
	public void setDefaultSchemaName(String defaultSchemaName) {
		this.defaultSchemaName = defaultSchemaName;
	}

	@SuppressWarnings("rawtypes")
	public Class<? extends List> getDefaultListImplementationClass() {
		return defaultListImplementationClass;
	}

	@SuppressWarnings("rawtypes")
	public void setDefaultListImplementationClass(Class<? extends List> defaultListImplementationClass) {
		this.defaultListImplementationClass = defaultListImplementationClass;
	}

	@SuppressWarnings("rawtypes")
	public Class<? extends Set> getDefaultSetImplementationClass() {
		return defaultSetImplementationClass;
	}

	@SuppressWarnings("rawtypes")
	public void setDefaultSetImplementationClass(Class<? extends Set> defaultSetImplementationClass) {
		this.defaultSetImplementationClass = defaultSetImplementationClass;
	}

	@SuppressWarnings("rawtypes")
	public Class<? extends Map> getDefaultMapImplementationClass() {
		return defaultMapImplementationClass;
	}

	@SuppressWarnings("rawtypes")
	public void setDefaultMapImplementationClass(Class<? extends Map> defaultMapImplementationClass) {
		this.defaultMapImplementationClass = defaultMapImplementationClass;
	}
	
}
