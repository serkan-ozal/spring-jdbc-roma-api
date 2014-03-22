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

import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperClass.RowMapperColumnNameResolver;
import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperClass.RowMapperObjectCreater;
import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperClass.RowMapperObjectProcessor;
import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperClass.RowMapperTableNameResolver;
import org.springframework.jdbc.roma.api.domain.builder.Builder;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperClassConfig;
import org.springframework.jdbc.roma.api.factory.RowMapperGeneratorFactory;

/**
 * @author Serkan ÖZAL
 */
public class RowMapperClassConfigBuilder implements Builder<RowMapperClassConfig> {

	private Class<?> clazz;
	@SuppressWarnings("rawtypes")
	private Class<? extends RowMapperGeneratorFactory> generatorFactoryClass;
	@SuppressWarnings("rawtypes")
	private Class<? extends RowMapperObjectCreater> objectCreaterClass;
	@SuppressWarnings("rawtypes")
	private Class<? extends RowMapperObjectProcessor> objectProcessorClass;
	private Class<? extends RowMapperColumnNameResolver> columnNameResolverClass;
	private Class<? extends RowMapperTableNameResolver> tableNameResolverClass;
	private String dataSourceName;
	private String schemaName;
	private String tableName;
	
	@Override
	public RowMapperClassConfig build() {
		RowMapperClassConfig config = new RowMapperClassConfig();
		config.setClazz(clazz);
		config.setGeneratorFactoryClass(generatorFactoryClass);
		config.setObjectCreaterClass(objectCreaterClass);
		config.setObjectProcessorClass(objectProcessorClass);
		config.setColumnNameResolverClass(columnNameResolverClass);
		config.setTableNameResolverClass(tableNameResolverClass);
		config.setDataSourceName(dataSourceName);
		config.setSchemaName(schemaName);
		config.setTableName(tableName);
		return config;
	}
	
	public RowMapperClassConfigBuilder clazz(Class<?> clazz) {
		this.clazz = clazz;
		return this;
	}
	
	@SuppressWarnings("rawtypes")
	public RowMapperClassConfigBuilder generatorFactoryClass(Class<? extends RowMapperGeneratorFactory> generatorFactoryClass) {
		if (generatorFactoryClass != null && generatorFactoryClass.equals(RowMapperGeneratorFactory.class) == false) {
			this.generatorFactoryClass = generatorFactoryClass;
		}	
		return this;
	}
	
	@SuppressWarnings("rawtypes")
	public RowMapperClassConfigBuilder objectCreaterClass(Class<? extends RowMapperObjectCreater> objectCreaterClass) {
		if (objectCreaterClass != null && objectCreaterClass.equals(RowMapperObjectCreater.class) == false) {
			this.objectCreaterClass = objectCreaterClass;
		}	
		return this;
	}
	
	@SuppressWarnings("rawtypes")
	public RowMapperClassConfigBuilder objectProcessorClass(Class<? extends RowMapperObjectProcessor> objectProcessorClass) {
		if (objectProcessorClass != null && objectProcessorClass.equals(RowMapperObjectProcessor.class) == false) {
			this.objectProcessorClass = objectProcessorClass;
		}	
		return this;
	}
	
	public RowMapperClassConfigBuilder columnNameResolverClass(Class<? extends RowMapperColumnNameResolver> columnNameResolverClass) {
		if (columnNameResolverClass != null && columnNameResolverClass.equals(RowMapperColumnNameResolver.class) == false) {
			this.columnNameResolverClass = columnNameResolverClass;
		}	
		return this;
	}
	
	public RowMapperClassConfigBuilder tableNameResolverClass(Class<? extends RowMapperTableNameResolver> tableNameResolverClass) {
		if (tableNameResolverClass != null && tableNameResolverClass.equals(RowMapperTableNameResolver.class) == false) {
			this.tableNameResolverClass = tableNameResolverClass;
		}	
		return this;
	}
	
	public RowMapperClassConfigBuilder dataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
		return this;
	}
	
	public RowMapperClassConfigBuilder schemaName(String schemaName) {
		this.schemaName = schemaName;
		return this;
	}
	
	public RowMapperClassConfigBuilder tableName(String tableName) {
		this.tableName = tableName;
		return this;
	}
	
}
