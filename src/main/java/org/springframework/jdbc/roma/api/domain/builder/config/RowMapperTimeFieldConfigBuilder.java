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
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperTimeFieldConfig;

/**
 * @author Serkan ÖZAL
 */
public class RowMapperTimeFieldConfigBuilder implements Builder<RowMapperTimeFieldConfig> {

	private Field field;
	private boolean asTimestamp;
	
	@Override
	public RowMapperTimeFieldConfig build() {
		RowMapperTimeFieldConfig config = new RowMapperTimeFieldConfig();
		config.setField(field);
		config.setAsTimestamp(asTimestamp);
		return config;
	}
	
	public RowMapperTimeFieldConfigBuilder field(Field field) {
		this.field = field;
		return this;
	}
	
	public RowMapperTimeFieldConfigBuilder asTimestamp(boolean asTimestamp) {
		this.asTimestamp = asTimestamp;
		return this;
	}
	
}
