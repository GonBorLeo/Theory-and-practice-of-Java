package com.intellekta.report;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyRepeatedAnnotation {
    ToRelease[] value();
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnotation.class)
public @interface ToRelease {
    String customerName() default "default name";

    int version() default 0;
}
