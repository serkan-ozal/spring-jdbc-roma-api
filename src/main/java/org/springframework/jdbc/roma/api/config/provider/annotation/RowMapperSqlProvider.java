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

/**
 * @author Serkan ÖZAL
 */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RowMapperSqlProvider {
	
	public String provideSql() default "";
	public String dataSourceName() default "";
	public Class<?> entityType() default Object.class;
	@SuppressWarnings("rawtypes")
	public Class<? extends RowMapperSqlQueryInfoProvider> sqlQueryInfoProvider() 
				default RowMapperSqlQueryInfoProvider.class;
	
	public static class SqlQueryInfo {
		
		public String sqlQuery;
		public Object[] args;
		
		public SqlQueryInfo() {
			
		}
		
		public SqlQueryInfo(String sqlQuery, Object[] args) {
			this.sqlQuery = sqlQuery;
			this.args = args;
		}

	}
	
	public interface RowMapperSqlQueryInfoProvider<T> {

		public SqlQueryInfo provideSqlQueryInfo(T obj, String fieldName);
		
	}
	
}
