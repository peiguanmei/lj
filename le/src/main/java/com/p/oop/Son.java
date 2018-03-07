package com.p.oop;

/**
 * Created by p on 2017/4/18.
 */
public class Son extends Parent{
    private int age = 22;
    protected String name = "child";
    public int weight = 55;
    double height = 1.75;

    public Son() {
        super();

    }
    public Son(int age, String name, String height) {
        super(age, name, height);
    }

    public void say() {
        System.out.println("son");
        System.out.println(super.height+"----"+super.name);
        super.say();
    }

    public void sayd() {
        System.out.println("ddddd");
    }
}
