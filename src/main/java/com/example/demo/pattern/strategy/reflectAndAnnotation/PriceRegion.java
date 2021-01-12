package com.example.demo.pattern.strategy.reflectAndAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PriceRegion {

    int min() default Integer.MIN_VALUE;
    int max() default Integer.MAX_VALUE;

}
