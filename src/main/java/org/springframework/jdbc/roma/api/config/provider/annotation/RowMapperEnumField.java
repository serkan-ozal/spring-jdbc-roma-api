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
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RowMapperEnumField {
	
	@Deprecated
	public String[] constantsAndMaps() default {};
	
	public int enumStartValue() default 0;
	
	public boolean useStringValue() default false;
	
	public int defaultIndex() default -1;
	public String defaultValue() default "";
	
	public RowMapperEnumAutoMapper mapViaAutoMapper() 
				default @RowMapperEnumAutoMapper;
	public RowMapperEnumNumericMapper mapViaNumericMapper() 
				default @RowMapperEnumNumericMapper(mapper = NumericEnumMapper.class);
	public RowMapperEnumStringMapper mapViaStringMapper() 
				default @RowMapperEnumStringMapper(mapper = StringEnumMapper.class);
	
	////////////////////////////////////////////////////////////////////////////////////
	
	@Target({ElementType.ANNOTATION_TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	@interface RowMapperEnumNumericValueNumericMapping {
		
		public int value();
		public int mappingIndex();
		
	}
	
	@Target({ElementType.ANNOTATION_TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	@interface RowMapperEnumNumericValueStringMapping {
		
		public int value();
		public String mappingValue();
		
	}
	
	@Target({ElementType.ANNOTATION_TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	@interface RowMapperEnumStringValueNumericMapping {
		
		public String value();
		public int mappingIndex();
		
	}
	
	@Target({ElementType.ANNOTATION_TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	@interface RowMapperEnumStringValueStringMapping {
		
		public String value();
		public String mappingValue();
		
	}
	
	@Target({ElementType.ANNOTATION_TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	@interface RowMapperEnumAutoMapper {
		
		public RowMapperEnumNumericValueNumericMapping[] mapViaNumericValueNumericMappings() default {};
		public RowMapperEnumNumericValueStringMapping[] mapViaNumericValueStringMappings() default {};
		public RowMapperEnumStringValueNumericMapping[] mapViaStringValueNumericMappings() default {};
		public RowMapperEnumStringValueStringMapping[] mapViaStringValueStringMappings() default {};
		
	}
	
	@Target({ElementType.ANNOTATION_TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	@interface RowMapperEnumNumericMapper {
		
		@SuppressWarnings("rawtypes")
		public Class<? extends NumericEnumMapper> mapper();
		
	}
	
	@Target({ElementType.ANNOTATION_TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	@interface RowMapperEnumStringMapper {
		
		@SuppressWarnings("rawtypes")
		public Class<? extends StringEnumMapper> mapper();
		
	}
	
	interface EnumMapper<E extends Enum<?>, T> {
		
		E map(T value);
		
	}
	
	interface NumericEnumMapper<E extends Enum<?>> extends EnumMapper<E, Integer> {
		
		@Override
		E map(Integer value);
		
	}
	
	interface StringEnumMapper<E extends Enum<?>> extends EnumMapper<E, String> {
		
		@Override
		E map(String value);
		
	}
	
}
