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

package org.springframework.jdbc.roma.api.domain.model.config;

import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperLazyCondition.RowMapperLazyConditionProvider;

/**
 * @author Serkan ÖZAL
 */
public class RowMapperLazyConditionConfig extends BaseRowMapperFieldConfig {

	private String propertyName;
	private String expression;
	@SuppressWarnings("rawtypes")
	private Class<? extends RowMapperLazyConditionProvider> lazyConditionProviderClass;
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public String getExpression() {
		return expression;
	}
	
	public void setExpression(String expression) {
		this.expression = expression;
	}
	
	@SuppressWarnings("rawtypes")
	public Class<? extends RowMapperLazyConditionProvider> getLazyConditionProviderClass() {
		return lazyConditionProviderClass;
	}
	
	@SuppressWarnings("rawtypes")
	public void setLazyConditionProviderClass(Class<? extends RowMapperLazyConditionProvider> lazyConditionProviderClass) {
		this.lazyConditionProviderClass = lazyConditionProviderClass;
	}
	
}
