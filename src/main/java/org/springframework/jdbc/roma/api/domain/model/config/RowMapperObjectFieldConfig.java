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

/**
 * @author Serkan ÖZAL
 */
public class RowMapperObjectFieldConfig extends BaseRowMapperFieldConfig {

	private RowMapperExpressionProviderConfig rowMapperExpressionProviderConfig;
	private RowMapperSqlProviderConfig rowMapperSqlProviderConfig;
	private RowMapperCustomProviderConfig rowMapperCustomProviderConfig;
	private boolean lazy = false;
	private RowMapperLazyConditionConfig rowMapperLazyConditionConfig;
	private RowMapperLazyLoadConditionConfig rowMapperLazyLoadConditionConfig;
	private RowMapperIgnoreConditionConfig rowMapperIgnoreConditionConfig;

	public RowMapperExpressionProviderConfig getRowMapperExpressionProviderConfig() {
		return rowMapperExpressionProviderConfig;
	}
	
	public void setRowMapperExpressionProviderConfig(RowMapperExpressionProviderConfig rowMapperExpressionProviderConfig) {
		this.rowMapperExpressionProviderConfig = rowMapperExpressionProviderConfig;
	}

	public RowMapperSqlProviderConfig getRowMapperSqlProviderConfig() {
		return rowMapperSqlProviderConfig;
	}
	
	public void setRowMapperSqlProviderConfig(RowMapperSqlProviderConfig rowMapperSqlProviderConfig) {
		this.rowMapperSqlProviderConfig = rowMapperSqlProviderConfig;
	}

	public RowMapperCustomProviderConfig getRowMapperCustomProviderConfig() {
		return rowMapperCustomProviderConfig;
	}

	public void setRowMapperCustomProviderConfig(RowMapperCustomProviderConfig rowMapperCustomProviderConfig) {
		this.rowMapperCustomProviderConfig = rowMapperCustomProviderConfig;
	}

	public boolean isLazy() {
		return lazy;
	}
	
	public void setLazy(boolean lazy) {
		this.lazy = lazy;
	}
	
	public RowMapperLazyConditionConfig getRowMapperLazyConditionConfig() {
		return rowMapperLazyConditionConfig;
	}
	
	public void setRowMapperLazyConditionConfig(RowMapperLazyConditionConfig rowMapperLazyConditionConfig) {
		this.rowMapperLazyConditionConfig = rowMapperLazyConditionConfig;
	}
	
	public RowMapperLazyLoadConditionConfig getRowMapperLazyLoadConditionConfig() {
		return rowMapperLazyLoadConditionConfig;
	}
	
	public void setRowMapperLazyLoadConditionConfig(RowMapperLazyLoadConditionConfig rowMapperLazyLoadConditionConfig) {
		this.rowMapperLazyLoadConditionConfig = rowMapperLazyLoadConditionConfig;
	}
	
	public RowMapperIgnoreConditionConfig getRowMapperIgnoreConditionConfig() {
		return rowMapperIgnoreConditionConfig;
	}
	
	public void setRowMapperIgnoreConditionConfig(RowMapperIgnoreConditionConfig rowMapperIgnoreConditionConfig) {
		this.rowMapperIgnoreConditionConfig = rowMapperIgnoreConditionConfig;
	}

}
