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

package org.springframework.jdbc.roma.api.config.provider;

import org.springframework.jdbc.roma.api.domain.model.config.RowMapperBlobFieldConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperClassConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperClobFieldConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperEnumFieldConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperFieldConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperObjectFieldConfig;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperTimeFieldConfig;

/**
 * @author Serkan ÖZAL
 */
public interface ConfigProvider {

	public boolean isAvailable();
	public RowMapperFieldConfig getRowMapperFieldConfig(Class<?> clazz, String fieldName);
	public RowMapperObjectFieldConfig getRowMapperObjectFieldConfig(Class<?> clazz, String fieldName);
	public RowMapperEnumFieldConfig getRowMapperEnumFieldConfig(Class<?> clazz, String fieldName);
	public RowMapperClobFieldConfig getRowMapperClobFieldConfig(Class<?> clazz, String fieldName);
	public RowMapperBlobFieldConfig getRowMapperBlobFieldConfig(Class<?> clazz, String fieldName);
	public RowMapperTimeFieldConfig getRowMapperTimeFieldConfig(Class<?> clazz, String fieldName);
	public RowMapperClassConfig getRowMapperClassConfig(Class<?> clazz);
	
}
