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

import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperLazyCondition.RowMapperLazyConditionProvider;
import org.springframework.jdbc.roma.api.domain.builder.Builder;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperLazyConditionConfig;

/**
 * @author Serkan ÖZAL
 */
public class RowMapperLazyConditionConfigBuilder implements Builder<RowMapperLazyConditionConfig> {

	private Field field;
	private String propertyName;
	private String expression;
	@SuppressWarnings("rawtypes")
	private Class<? extends RowMapperLazyConditionProvider> lazyConditionProviderClass;
	
	@Override
	public RowMapperLazyConditionConfig build() {
		RowMapperLazyConditionConfig config = new RowMapperLazyConditionConfig();
		config.setField(field);
		config.setPropertyName(propertyName);
		config.setExpression(expression);
		config.setLazyConditionProviderClass(lazyConditionProviderClass);
		return config;
	}
	
	public RowMapperLazyConditionConfigBuilder field(Field field) {
		this.field = field;
		return this;
	}
	
	public RowMapperLazyConditionConfigBuilder propertyName(String propertyName) {
		this.propertyName = propertyName;
		return this;
	}

	public RowMapperLazyConditionConfigBuilder expression(String expression) {
		this.expression = expression;
		return this;
	}

	@SuppressWarnings("rawtypes")
	public RowMapperLazyConditionConfigBuilder lazyConditionProviderClass(Class<? extends RowMapperLazyConditionProvider> lazyConditionProviderClass) {
		if (lazyConditionProviderClass != null && lazyConditionProviderClass.equals(RowMapperLazyConditionProvider.class) == false) {
			this.lazyConditionProviderClass = lazyConditionProviderClass;
		}	
		return this;
	}
	
}
