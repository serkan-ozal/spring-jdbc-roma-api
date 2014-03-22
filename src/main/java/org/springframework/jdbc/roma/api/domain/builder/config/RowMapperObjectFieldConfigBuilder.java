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

import org.springframework.jdbc.roma.api.domain.builder.Builder;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperCustomProviderConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperImplementationProviderConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperLazyConditionConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperObjectFieldConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperSpringProviderConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperSqlProviderConfig;

/**
 * @author Serkan ÖZAL
 */
public class RowMapperObjectFieldConfigBuilder implements Builder<RowMapperObjectFieldConfig> {

	private Field field;
	private RowMapperSpringProviderConfig rowMapperSpringProviderConfig;
	private RowMapperSqlProviderConfig rowMapperSqlProviderConfig;
	private RowMapperImplementationProviderConfig rowMapperImplementationProviderConfig;
	private RowMapperCustomProviderConfig rowMapperCustomProviderConfig;
	private Class<?> fieldType;
	private boolean lazy = false;
	private RowMapperLazyConditionConfig rowMapperLazyConditionConfig;
	
	@Override
	public RowMapperObjectFieldConfig build() {
		RowMapperObjectFieldConfig config = new RowMapperObjectFieldConfig();
		config.setField(field);
		config.setRowMapperSpringProviderConfig(rowMapperSpringProviderConfig);
		config.setRowMapperSqlProviderConfig(rowMapperSqlProviderConfig);
		config.setRowMapperImplementationProviderConfig(rowMapperImplementationProviderConfig);
		config.setRowMapperCustomProviderConfig(rowMapperCustomProviderConfig);
		config.setFieldType(fieldType);
		config.setLazy(lazy);
		config.setRowMapperLazyConditionConfig(rowMapperLazyConditionConfig);
		return config;
	}
	
	public RowMapperObjectFieldConfigBuilder field(Field field) {
		this.field = field;
		return this;
	}
	
	public RowMapperObjectFieldConfigBuilder rowMapperSpringProviderConfig(
			RowMapperSpringProviderConfig rowMapperSpringProviderConfig) {
		this.rowMapperSpringProviderConfig = rowMapperSpringProviderConfig;
		return this;
	}
	
	public RowMapperObjectFieldConfigBuilder rowMapperSqlProviderConfig(
			RowMapperSqlProviderConfig rowMapperSqlProviderConfig) {
		this.rowMapperSqlProviderConfig = rowMapperSqlProviderConfig;
		return this;
	}
	
	public RowMapperObjectFieldConfigBuilder rowMapperImplementationProviderConfig(
			RowMapperImplementationProviderConfig rowMapperImplementationProviderConfig) {
		this.rowMapperImplementationProviderConfig = rowMapperImplementationProviderConfig;
		return this;
	}
	
	public RowMapperObjectFieldConfigBuilder rowMapperCustomProviderConfig(
			RowMapperCustomProviderConfig rowMapperCustomProviderConfig) {
		this.rowMapperCustomProviderConfig = rowMapperCustomProviderConfig;	
		return this;
	}
	
	public RowMapperObjectFieldConfigBuilder fieldType(Class<?> fieldType) {
		this.fieldType = fieldType;
		return this;
	}
	
	public RowMapperObjectFieldConfigBuilder lazy(boolean lazy) {
		this.lazy = lazy;
		return this;
	}
	
	public RowMapperObjectFieldConfigBuilder rowMapperLazyConditionConfig(
			RowMapperLazyConditionConfig rowMapperLazyConditionConfig) {
		this.rowMapperLazyConditionConfig = rowMapperLazyConditionConfig;	
		return this;
	}

}
