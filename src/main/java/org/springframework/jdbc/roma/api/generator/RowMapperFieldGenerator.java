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

package org.springframework.jdbc.roma.api.generator;

import java.lang.reflect.Field;

/**
 * @author Serkan ÖZAL
 */
public interface RowMapperFieldGenerator<T> {

	public static final String GENERATED_OBJECT_NAME = "mappedObject";
	public static final String VARIABLES_AND_CODE_SEPARATOR = "$$$";
	public static final String RESULT_SET_ARGUMENT = "$1";
	public static final String ROW_NUM_ARGUMENT = "$2";
	
	public String generateFieldMapping(Field f);
	
}
