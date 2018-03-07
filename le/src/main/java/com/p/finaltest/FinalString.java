package com.p.finaltest;

/**
 * Created by p on 2017/3/29.
 * 1、被final修饰的类不可以被继承
 * 2、被final修饰的方法不可以被重写
 * 3、被final修饰的变量不可以被改变
 */
final public class FinalString {
    private String str;

    final String name = "p";

    final void test() {
        System.out.println("final test");
    }

    public FinalString() {

    }

    public FinalString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
