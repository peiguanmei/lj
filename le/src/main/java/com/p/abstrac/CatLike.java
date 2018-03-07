package com.p.abstrac;

/**
 * Created by p on 2017/4/18.
 */
public abstract class CatLike extends Animal{

    public abstract void eat();

    public void say() {
        System.out.println("catlike");
    }

    public void run() {
        System.out.println("catlike run fast");
    }

}
