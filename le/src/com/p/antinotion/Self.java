package com.p.antinotion;

import java.lang.annotation.*;

/**
 * Created by p on 2017/3/7.
 */
public class Self {
    //RUNTIME CLASS SOURCE
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    @Documented
    public @interface Description {
        String desc();

        String author();

        int age() default 18;
    }
}
