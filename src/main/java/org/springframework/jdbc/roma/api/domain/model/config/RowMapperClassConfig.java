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

import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperClass.RowMapperColumnNameResolver;
import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperClass.RowMapperObjectCreater;
import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperClass.RowMapperObjectProcessor;
import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperClass.RowMapperTableNameResolver;
import org.springframework.jdbc.roma.api.factory.RowMapperFieldGeneratorFactory;

/**
 * @author Serkan ÖZAL
 */
public class RowMapperClassConfig extends BaseRowMapperClassConfig {

	@SuppressWarnings("rawtypes")
	private Class<? extends RowMapperFieldGeneratorFactory> fieldGeneratorFactoryClass;
	@SuppressWarnings("rawtypes")
	private Class<? extends RowMapperObjectCreater> objectCreaterClass;
	@SuppressWarnings("rawtypes")
	private Class<? extends RowMapperObjectProcessor> objectProcessorClass;
	private Class<? extends RowMapperColumnNameResolver> columnNameResolverClass;
	private Class<? extends RowMapperTableNameResolver> tableNameResolverClass;
	private String dataSourceName;
	private String schemaName;
	private String tableName;
	
	@SuppressWarnings("rawtypes")
	public Class<? extends RowMapperFieldGeneratorFactory> getFieldGeneratorFactoryClass() {
		return fieldGeneratorFactoryClass;
	}
	
	@SuppressWarnings("rawtypes")
	public void setFieldGeneratorFactoryClass(Class<? extends RowMapperFieldGeneratorFactory> fieldGeneratorFactoryClass) {
		this.fieldGeneratorFactoryClass = fieldGeneratorFactoryClass;
	}
	
	@SuppressWarnings("rawtypes")
	public Class<? extends RowMapperObjectCreater> getObjectCreaterClass() {
		return objectCreaterClass;
	}
	
	@SuppressWarnings("rawtypes")
	public void setObjectCreaterClass(Class<? extends RowMapperObjectCreater> objectCreaterClass) {
		this.objectCreaterClass = objectCreaterClass;
	}
	
	@SuppressWarnings("rawtypes")
	public Class<? extends RowMapperObjectProcessor> getObjectProcessorClass() {
		return objectProcessorClass;
	}
	
	@SuppressWarnings("rawtypes")
	public void setObjectProcessorClass(Class<? extends RowMapperObjectProcessor> objectProcessorClass) {
		this.objectProcessorClass = objectProcessorClass;
	}
	
	public Class<? extends RowMapperColumnNameResolver> getColumnNameResolverClass() {
		return columnNameResolverClass;
	}
	
	public void setColumnNameResolverClass(Class<? extends RowMapperColumnNameResolver> columnNameResolverClass) {
		this.columnNameResolverClass = columnNameResolverClass;
	}
	
	public Class<? extends RowMapperTableNameResolver> getTableNameResolverClass() {
		return tableNameResolverClass;
	}
	
	public void setTableNameResolverClass(Class<? extends RowMapperTableNameResolver> tableNameResolverClass) {
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
