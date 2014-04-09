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
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperExpressionProviderConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperIgnoreConditionConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperLazyConditionConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperLazyLoadConditionConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperObjectFieldConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperSqlProviderConfig;

/**
 * @author Serkan ÖZAL
 */
public class RowMapperObjectFieldConfigBuilder implements Builder<RowMapperObjectFieldConfig> {

	private Field field;
	private RowMapperExpressionProviderConfig rowMapperExpressionProviderConfig;
	private RowMapperSqlProviderConfig rowMapperSqlProviderConfig;
	private RowMapperCustomProviderConfig rowMapperCustomProviderConfig;
	private boolean lazy = false;
	private RowMapperLazyConditionConfig rowMapperLazyConditionConfig;
	private RowMapperLazyLoadConditionConfig rowMapperLazyLoadConditionConfig;
	private RowMapperIgnoreConditionConfig rowMapperIgnoreConditionConfig;
	
	@Override
	public RowMapperObjectFieldConfig build() {
		RowMapperObjectFieldConfig config = new RowMapperObjectFieldConfig();
		config.setField(field);
		config.setRowMapperExpressionProviderConfig(rowMapperExpressionProviderConfig);
		config.setRowMapperSqlProviderConfig(rowMapperSqlProviderConfig);
		config.setRowMapperCustomProviderConfig(rowMapperCustomProviderConfig);
		config.setLazy(lazy);
		config.setRowMapperLazyConditionConfig(rowMapperLazyConditionConfig);
		config.setRowMapperLazyLoadConditionConfig(rowMapperLazyLoadConditionConfig);
		config.setRowMapperIgnoreConditionConfig(rowMapperIgnoreConditionConfig);
		return config;
	}
	
	public RowMapperObjectFieldConfigBuilder field(Field field) {
		this.field = field;
		return this;
	}

	public RowMapperObjectFieldConfigBuilder rowMapperExpressionProviderConfig(
			RowMapperExpressionProviderConfig rowMapperExpressionProviderConfig) {
		this.rowMapperExpressionProviderConfig = rowMapperExpressionProviderConfig;	
		return this;
	}
	
	public RowMapperObjectFieldConfigBuilder rowMapperSqlProviderConfig(
			RowMapperSqlProviderConfig rowMapperSqlProviderConfig) {
		this.rowMapperSqlProviderConfig = rowMapperSqlProviderConfig;
		return this;
	}

	public RowMapperObjectFieldConfigBuilder rowMapperCustomProviderConfig(
			RowMapperCustomProviderConfig rowMapperCustomProviderConfig) {
		this.rowMapperCustomProviderConfig = rowMapperCustomProviderConfig;	
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
	
	public RowMapperObjectFieldConfigBuilder rowMapperLazyLoadConditionConfig(
			RowMapperLazyLoadConditionConfig rowMapperLazyLoadConditionConfig) {
		this.rowMapperLazyLoadConditionConfig = rowMapperLazyLoadConditionConfig;	
		return this;
	}
	
	public RowMapperObjectFieldConfigBuilder rowMapperIgnoreConditionConfig(
			RowMapperIgnoreConditionConfig rowMapperIgnoreConditionConfig) {
		this.rowMapperIgnoreConditionConfig = rowMapperIgnoreConditionConfig;	
		return this;
	}

}
