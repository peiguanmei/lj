package com.p.oop;

/**
 * Created by p on 2017/4/18.
 */
public class Parent {
    private int age = 50;
    protected String name = "dad";
    public String height = "60";
    public String str = "aaa";

    public Parent(int age, String name, String height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public Parent() {

    }

    @Override
    public String toString() {
        return "Parent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public void say() {
        System.out.println("parent");
    }
}
