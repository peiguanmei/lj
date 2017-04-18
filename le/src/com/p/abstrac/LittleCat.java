package com.p.abstrac;

/**
 * Created by p on 2017/4/18.
 */
public class LittleCat extends Cat{
    public void eat() {
        System.out.println("eat a little fish");
    }

    public static void main(String[] args) {
        LittleCat cat = new LittleCat();
        cat.eat();
    }
}
