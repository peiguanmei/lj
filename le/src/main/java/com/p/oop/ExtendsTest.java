package com.p.oop;

/**
 * Created by p on 2017/4/18.
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Son son = new Son();
        son.say();
        Parent parent = new Parent();
        System.out.println(parent.height);
        Parent ps = new Parent();
        System.out.println(ps.height);

    }
}
