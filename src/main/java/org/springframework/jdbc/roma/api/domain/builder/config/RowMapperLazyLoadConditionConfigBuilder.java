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

package org.springframework.jdbc.roma.api.domain.builder.config;

import java.lang.reflect.Field;

import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperLazyLoadCondition.RowMapperLazyLoadConditionProvider;
import org.springframework.jdbc.roma.api.domain.builder.Builder;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperLazyLoadConditionConfig;

/**
 * @author Serkan ÖZAL
 */
public class RowMapperLazyLoadConditionConfigBuilder implements Builder<RowMapperLazyLoadConditionConfig> {

	private Field field;
	private String propertyName;
	private String expression;
	@SuppressWarnings("rawtypes")
	private Class<? extends RowMapperLazyLoadConditionProvider> lazyLoadConditionProviderClass;
	
	@Override
	public RowMapperLazyLoadConditionConfig build() {
		RowMapperLazyLoadConditionConfig config = new RowMapperLazyLoadConditionConfig();
		config.setField(field);
		config.setPropertyName(propertyName);
		config.setExpression(expression);
		config.setLazyLoadConditionProviderClass(lazyLoadConditionProviderClass);
		return config;
	}
	
	public RowMapperLazyLoadConditionConfigBuilder field(Field field) {
		this.field = field;
		return this;
	}
	
	public RowMapperLazyLoadConditionConfigBuilder propertyName(String propertyName) {
		this.propertyName = propertyName;
		return this;
	}

	public RowMapperLazyLoadConditionConfigBuilder expression(String expression) {
		this.expression = expression;
		return this;
	}

	@SuppressWarnings("rawtypes")
	public RowMapperLazyLoadConditionConfigBuilder lazyLoadConditionProviderClass(
			Class<? extends RowMapperLazyLoadConditionProvider> lazyLoadConditionProviderClass) {
		if (lazyLoadConditionProviderClass != null && 
				lazyLoadConditionProviderClass.equals(RowMapperLazyLoadConditionProvider.class) == false) {
			this.lazyLoadConditionProviderClass = lazyLoadConditionProviderClass;
		}	
		return this;
	}
	
}
