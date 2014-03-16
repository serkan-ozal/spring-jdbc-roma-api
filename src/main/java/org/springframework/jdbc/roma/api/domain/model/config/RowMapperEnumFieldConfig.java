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

import java.util.Map;

import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperEnumField.NumericEnumMapper;
import org.springframework.jdbc.roma.api.config.provider.annotation.RowMapperEnumField.StringEnumMapper;

/**
 * @author Serkan ÖZAL
 */
public class RowMapperEnumFieldConfig extends BaseRowMapperFieldConfig {

	private Map<Integer, String> constantsAndMaps;
	private boolean useStringValue;
	private int enumStartValue;
	private Map<Integer, String> numericValueStringMappings;
	private Map<String, String> stringValueStringMappings;
	private Map<Integer, Integer> numericValueNumericMappings;
	private Map<String, Integer> stringValueNumericMappings;
	@SuppressWarnings("rawtypes")
	private Class<? extends NumericEnumMapper> numericMapperClass;
	@SuppressWarnings("rawtypes")
	private Class<? extends StringEnumMapper> stringMapperClass;
	
	public Map<Integer, String> getConstantsAndMaps() {
		return constantsAndMaps;
	}
	
	public void setConstantsAndMaps(Map<Integer, String> constantsAndMaps) {
		this.constantsAndMaps = constantsAndMaps;
	}
	
	public boolean isUseStringValue() {
		return useStringValue;
	}
	
	public void setUseStringValue(boolean useStringValue) {
		this.useStringValue = useStringValue;
	}

	public int getEnumStartValue() {
		return enumStartValue;
	}

	public void setEnumStartValue(int enumStartValue) {
		this.enumStartValue = enumStartValue;
	}

	public Map<Integer, String> getNumericValueStringMappings() {
		return numericValueStringMappings;
	}

	public void setNumericValueStringMappings(Map<Integer, String> numericValueStringMappings) {
		this.numericValueStringMappings = numericValueStringMappings;
	}

	public Map<String, String> getStringValueStringMappings() {
		return stringValueStringMappings;
	}

	public void setStringValueStringMappings(Map<String, String> stringValueStringMappings) {
		this.stringValueStringMappings = stringValueStringMappings;
	}

	public Map<Integer, Integer> getNumericValueNumericMappings() {
		return numericValueNumericMappings;
	}

	public void setNumericValueNumericMappings(Map<Integer, Integer> numericValueNumericMappings) {
		this.numericValueNumericMappings = numericValueNumericMappings;
	}
	
	public Map<String, Integer> getStringValueNumericMappings() {
		return stringValueNumericMappings;
	}
	
	public void setStringValueNumericMappings(Map<String, Integer> stringValueNumericMappings) {
		this.stringValueNumericMappings = stringValueNumericMappings;
	}

	@SuppressWarnings("rawtypes")
	public Class<? extends NumericEnumMapper> getNumericMapperClass() {
		return numericMapperClass;
	}

	@SuppressWarnings("rawtypes")
	public void setNumericMapperClass(Class<? extends NumericEnumMapper> numericMapperClass) {
		this.numericMapperClass = numericMapperClass;
	}

	@SuppressWarnings("rawtypes")
	public Class<? extends StringEnumMapper> getStringMapperClass() {
		return stringMapperClass;
	}

	@SuppressWarnings("rawtypes")
	public void setStringMapperClass(Class<? extends StringEnumMapper> stringMapperClass) {
		this.stringMapperClass = stringMapperClass;
	}

}
