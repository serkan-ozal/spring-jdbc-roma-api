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
import java.util.Map;

import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperEnumField.NumericEnumMapper;
import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperEnumField.StringEnumMapper;
import org.springframework.jdbc.roma.api.domain.builder.Builder;
import org.springframework.jdbc.roma.api.domain.model.config.RowMapperEnumFieldConfig;

/**
 * @author Serkan ÖZAL
 */
public class RowMapperEnumFieldConfigBuilder implements Builder<RowMapperEnumFieldConfig> {

	private Field field;
	private String[] constantsAndMaps;
	private int enumStartValue;
	private Map<Integer, String> numericValueStringMappings;
	private Map<String, String> stringValueStringMappings;
	private Map<Integer, Integer> numericValueNumericMappings;
	@SuppressWarnings("rawtypes")
	private Class<? extends NumericEnumMapper> numericMapperClass;
	@SuppressWarnings("rawtypes")
	private Class<? extends StringEnumMapper> stringMapperClass;
	
	@Override
	public RowMapperEnumFieldConfig build() {
		RowMapperEnumFieldConfig config = new RowMapperEnumFieldConfig();
		config.setField(field);
		config.setConstantsAndMaps(constantsAndMaps);
		config.setEnumStartValue(enumStartValue);
		config.setNumericValueStringMappings(numericValueStringMappings);
		config.setStringValueStringMappings(stringValueStringMappings);
		config.setNumericValueNumericMappings(numericValueNumericMappings);
		config.setNumericMapperClass(numericMapperClass);
		config.setStringMapperClass(stringMapperClass);
		return config;
	}
	
	public RowMapperEnumFieldConfigBuilder field(Field field) {
		this.field = field;
		return this;
	}
	
	public RowMapperEnumFieldConfigBuilder constantsAndMaps(String[] constantsAndMaps) {
		this.constantsAndMaps = constantsAndMaps;
		return this;
	}
	
	public RowMapperEnumFieldConfigBuilder enumStartValue(int enumStartValue) {
		this.enumStartValue = enumStartValue;
		return this;
	}
	
	public RowMapperEnumFieldConfigBuilder numericValueStringMappings(Map<Integer, String> numericValueStringMappings) {
		this.numericValueStringMappings = numericValueStringMappings;
		return this;
	}
	
	public RowMapperEnumFieldConfigBuilder stringValueStringMappings(Map<String, String> stringValueStringMappings) {
		this.stringValueStringMappings = stringValueStringMappings;
		return this;
	}
	
	public RowMapperEnumFieldConfigBuilder numericValueNumericMappings(Map<Integer, Integer> numericValueNumericMappings) {
		this.numericValueNumericMappings = numericValueNumericMappings;
		return this;
	}
	
	@SuppressWarnings("rawtypes")
	public RowMapperEnumFieldConfigBuilder numericMapperClass(Class<? extends NumericEnumMapper> numericMapperClass) {
		if (numericMapperClass.equals(NumericEnumMapper.class) == false) {
			this.numericMapperClass = numericMapperClass;
		}	
		return this;
	}
	
	@SuppressWarnings("rawtypes")
	public RowMapperEnumFieldConfigBuilder stringMapperClass(Class<? extends StringEnumMapper> stringMapperClass) {
		if (stringMapperClass.equals(StringEnumMapper.class) == false) {
			this.stringMapperClass = stringMapperClass;
		}	
		return this;
	}

}
