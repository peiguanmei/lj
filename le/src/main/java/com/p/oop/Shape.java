package com.p.oop;

/**
 * Created by p on 2017/4/18.
 */
public class Shape {
    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }

    public String name = "shape";
    public String area = "300";

    public Shape(){
        System.out.println("shape constructor");
    }

    public void say() {
        System.out.println("hello");
    }
    public void printType() {
        System.out.println("this is shape");
    }

    public static void printName() {
        System.out.println("shape");
    }
}
