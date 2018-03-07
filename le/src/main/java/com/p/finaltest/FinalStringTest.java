package com.p.finaltest;

/**
 * Created by p on 2017/3/29.
 * 3、被final修饰的变量不可以被改变
 */
public class FinalStringTest {
    public static void main(String[] args) {
        final FinalString fs = new FinalString("abc");
        final FinalString fs2 = new FinalString("123");
        fs.setStr("1234");
        System.out.println(fs.getStr());
        //被final修饰不可变的是变量的引用，而不是引用指向的内容，引用指向的内容是可以改变的
        //fs = fs2;
        System.out.println(fs.getStr());
    }
}
