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

import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperIgnoreCondition.RowMapperIgnoreConditionProvider;
import org.springframework.jdbc.roma.api.domain.builder.Builder;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperIgnoreConditionConfig;

/**
 * @author Serkan ÖZAL
 */
public class RowMapperIgnoreConditionConfigBuilder implements Builder<RowMapperIgnoreConditionConfig> {

	private Field field;
	private String propertyName;
	private String expression;
	@SuppressWarnings("rawtypes")
	private Class<? extends RowMapperIgnoreConditionProvider> ignoreConditionProviderClass;
	
	@Override
	public RowMapperIgnoreConditionConfig build() {
		RowMapperIgnoreConditionConfig config = new RowMapperIgnoreConditionConfig();
		config.setField(field);
		config.setPropertyName(propertyName);
		config.setExpression(expression);
		config.setIgnoreConditionProviderClass(ignoreConditionProviderClass);
		return config;
	}
	
	public RowMapperIgnoreConditionConfigBuilder field(Field field) {
		this.field = field;
		return this;
	}
	
	public RowMapperIgnoreConditionConfigBuilder propertyName(String propertyName) {
		this.propertyName = propertyName;
		return this;
	}

	public RowMapperIgnoreConditionConfigBuilder expression(String expression) {
		this.expression = expression;
		return this;
	}

	@SuppressWarnings("rawtypes")
	public RowMapperIgnoreConditionConfigBuilder ignoreConditionProviderClass(
			Class<? extends RowMapperIgnoreConditionProvider> ignoreConditionProviderClass) {
		if (ignoreConditionProviderClass != null && 
				ignoreConditionProviderClass.equals(RowMapperIgnoreConditionProvider.class) == false) {
			this.ignoreConditionProviderClass = ignoreConditionProviderClass;
		}	
		return this;
	}
	
}
