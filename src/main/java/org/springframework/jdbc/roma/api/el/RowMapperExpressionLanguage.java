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

package org.springframework.jdbc.roma.api.el;

import java.util.regex.Pattern;

/**
 * @author Serkan ÖZAL
 */
public interface RowMapperExpressionLanguage {

	public static final String BEAN_SIGN = "@";
	public static final String PROPERTY_SIGN = "$";
	public static final String RESULT_SET_SIGN = "&";
	public static final String ATTRIBUTE_SIGN = "#";
	
	public static final String BEAN_PATTERN_EXPRESSION = "@\\{([^\\{]+)\\}";
	public static final String PROPERTY_PATTERN_EXPRESSION = "\\$\\{([^\\{]+)\\}";
	public static final String RESULT_SET_PATTERN_EXPRESSION = "&\\{\\[([^\\[]+)\\]([^\\{]+)\\}";
	public static final String ATTRIBUTE_EXPRESSION = "\\#\\{([^\\{]+)\\}";
	public static final String PROPERTY_OR_RESULT_SET_PATTERN_EXPRESSION = 
			PROPERTY_PATTERN_EXPRESSION + "|" + RESULT_SET_PATTERN_EXPRESSION;
	
	public static final Pattern BEAN_PATTERN = Pattern.compile(BEAN_PATTERN_EXPRESSION);
	public static final Pattern PROPERTY_PATTERN = Pattern.compile(PROPERTY_PATTERN_EXPRESSION);
	public static final Pattern RESULT_SET_PATTERN = Pattern.compile(RESULT_SET_PATTERN_EXPRESSION);
	public static final Pattern ATTRIBUTE_PATTERN = Pattern.compile(ATTRIBUTE_EXPRESSION);
	public static final Pattern PROPERTY_OR_RESULT_SET_PATTERN = Pattern.compile(PROPERTY_OR_RESULT_SET_PATTERN_EXPRESSION);
	
}
