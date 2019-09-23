package com.p.c.reflectiontutorial;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by byhieg on 17/1/9.
 * Mail to byhieg@gmail.com
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    public String name();
    public String value();

}
