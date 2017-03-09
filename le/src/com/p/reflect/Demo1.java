package com.p.reflect;

/**
 * Created by p on 2017/3/7.
 */
public class Demo1 {
    public static void main(String[] args) {
        Class c1 = F.class;
        try {
            //equals  F foo = new F();
            F foo = (F) c1.newInstance();
            foo.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

