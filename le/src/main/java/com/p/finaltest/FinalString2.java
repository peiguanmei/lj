package com.p.finaltest;

/**
 * Created by p on 2017/3/29.
 */
public class FinalString2 {
        private String str;

    final String name = "p";

    final void test() {
        System.out.println("final test");
    }

    public FinalString2() {

    }

    public FinalString2(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
