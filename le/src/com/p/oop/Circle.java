package com.p.oop;

/**
 * Created by p on 2017/4/18.
 */
public class Circle extends Shape{
    public String name = "circle";

    public Circle() {
        super.printType();
        super.printName();
        say();
        printName();
        printType();

        System.out.println("circle constructor"+area);
    }

    public void printType() {
        System.out.println("this is circle");
    }

    public static void printName() {
        System.out.println("circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                '}';
    }
}
