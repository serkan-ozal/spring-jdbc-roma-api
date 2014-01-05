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

import org.springframework.jdbc.roma.api.factory.RowMapperGeneratorFactory;
import org.springframework.jdbc.roma.api.resolver.ColumnNameResolver;
import org.springframework.jdbc.roma.api.resolver.TableNameResolver;

/**
 * @author Serkan ÖZAL
 */
public class RowMapperClassConfig extends BaseRowMapperClassConfig {

	@SuppressWarnings("rawtypes")
	private Class<? extends RowMapperGeneratorFactory> generatorFactoryClass;
	private Class<? extends ColumnNameResolver> columnNameResolverClass;
	private Class<? extends TableNameResolver> tableNameResolverClass;
	private String dataSourceName;
	private String schemaName;
	private String tableName;
	
	@SuppressWarnings("rawtypes")
	public Class<? extends RowMapperGeneratorFactory> getGeneratorFactoryClass() {
		return generatorFactoryClass;
	}
	
	@SuppressWarnings("rawtypes")
	public void setGeneratorFactoryClass(Class<? extends RowMapperGeneratorFactory> generatorFactoryClass) {
		this.generatorFactoryClass = generatorFactoryClass;
	}
	
	public Class<? extends ColumnNameResolver> getColumnNameResolverClass() {
		return columnNameResolverClass;
	}
	
	public void setColumnNameResolverClass(Class<? extends ColumnNameResolver> columnNameResolverClass) {
		this.columnNameResolverClass = columnNameResolverClass;
	}
	
	public Class<? extends TableNameResolver> getTableNameResolverClass() {
		return tableNameResolverClass;
	}
	
	public void setTableNameResolverClass(Class<? extends TableNameResolver> tableNameResolverClass) {
		this.tableNameResolverClass = tableNameResolverClass;
	}
	
	public String getDataSourceName() {
		return dataSourceName;
	}
	
	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}
	
	public String getSchemaName() {
		return schemaName;
	}
	
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	
	public String getTableName() {
		return tableName;
	}
	
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
}
