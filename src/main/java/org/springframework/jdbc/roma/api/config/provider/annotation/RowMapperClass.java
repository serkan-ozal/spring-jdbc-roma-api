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

package org.springframework.jdbc.roma.api.config.provider.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.jdbc.roma.api.creater.RowMapperObjectCreater;
import org.springframework.jdbc.roma.api.factory.RowMapperGeneratorFactory;
import org.springframework.jdbc.roma.api.resolver.ColumnNameResolver;
import org.springframework.jdbc.roma.api.resolver.TableNameResolver;

/**
 * @author Serkan ÖZAL
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RowMapperClass {
	
	@SuppressWarnings("rawtypes")
	public Class<? extends RowMapperGeneratorFactory> generatorFactory() default RowMapperGeneratorFactory.class;
	@SuppressWarnings("rawtypes")
	public Class<? extends RowMapperObjectCreater> objectCreater() default RowMapperObjectCreater.class;
	public Class<? extends ColumnNameResolver> columnNameResolver() default ColumnNameResolver.class;
	public Class<? extends TableNameResolver> tableNameResolver() default TableNameResolver.class;
	public String dataSourceName() default "";
	public String schemaName() default "";
	public String tableName() default "";
	
}
