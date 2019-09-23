package com.p.c.designpatterntutorial.proxy.dynamicproxy;


/**
 * Created by shiqifeng on 2017/3/17.
 * Mail p@gmail.com
 */
public class RealSubject implements Subject {

    private String name = "p";
    @Override
    public void visit() {
        System.out.println(name);
    }
}
