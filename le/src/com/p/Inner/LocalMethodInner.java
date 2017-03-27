package com.p.Inner;

import java.util.HashMap;
import java.util.Map;

/*
 * 本地方法内部类
 */
public class LocalMethodInner {
    private String x = "outer";

    public void doStuff() {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        class MyInner {
            public void seeOuter() {
                System.out.println("xis " + x);
            }
        }

        MyInner i = new MyInner();
        i.seeOuter();
    }

    public static void main(String[] args) {
        LocalMethodInner o = new LocalMethodInner();
        o.doStuff();
    }
}
