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
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RowMapperPropertyBasedLazyConditionAware {
	
	public static final int ENABLE_ON_START = 1;
	public static final int DISABLE_ON_START = 2;
	public static final int ENABLE_ON_FINISH = 4;
	public static final int DISABLE_ON_FINISH = 8;
	public static final int DEFAULT_OPTIONS = ENABLE_ON_START | DISABLE_ON_FINISH;
	
	public String propertyName();
	public int options() default DEFAULT_OPTIONS;
	
}
