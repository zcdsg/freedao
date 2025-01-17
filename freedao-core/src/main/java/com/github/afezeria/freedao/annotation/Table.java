package com.github.afezeria.freedao.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String name() default "";

    String schema() default "";

    String database() default "";

    /**
     * 实体类的字段名数组
     * @return
     */
    String[] primaryKeys() default {};
}
