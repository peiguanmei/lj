package com.p.reflect;

/**
 * Created by p on 2017/3/7.
 */
public class Demo2 {
    public static void main(String[] args) {
        Class c1 = int.class;
        Class c2 = String.class;
        Class c3 =  Void.class;
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());
        System.out.println(c3.getName());
    }
}
