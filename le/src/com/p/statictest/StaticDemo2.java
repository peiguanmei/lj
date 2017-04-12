package com.p.statictest;

/**
 * Created by p on 2017/4/10.
 */
public class StaticDemo2 {
    private static int x = 100;
    private static String y;

    public static void main(String args[]) {
        StaticDemo2 hs1 = new StaticDemo2();
        hs1.x++;
        StaticDemo2 hs2 = new StaticDemo2();
        hs2.x++;
        hs1 = new StaticDemo2();
        hs1.x++;
        StaticDemo2.x--;
        System.out.println("x=" + x);
        System.out.println(y);
    }
}
