package com.p.equals;

import org.junit.Test;

/**
 * Created by p on 2017/4/10.
 */
public class TestEquals {
/*    long width;

    public TestEquals(long width) {
        this.width = width;
    }

    public static void main(String[] args) {
        TestEquals a,b,c;
        a = new TestEquals(42L);
        b = new TestEquals(42L);
        c = b;
        long s = 42L;
        System.out.println(a);
        System.out.println(a==b);
        //System.out.println(s==a);
        System.out.println(c==b);
        System.out.println(a.equals(s));
    }*/

    /**
     *  ①无论如何，Integer与new Integer不会相等。不会经历拆箱过程，i3的引用指向堆，而i4指向专门存放他的内存（常量池），他们的内存地址不一样，所以为false
        ②两个都是非new出来的Integer，如果数在-128到127之间，则是true,否则为false
        java在编译Integer i2 = 128的时候,被翻译成-> Integer i2 = Integer.valueOf(128);而valueOf()函数会对-128到127之间的数进行缓存
        ③两个都是new出来的,都为false
        ④int和integer(无论new否)比，都为true，因为会把Integer自动拆箱为int再去比
     */
    @Test
    public void TestInteger() {
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 = Integer.valueOf(59);
        Integer i04 = new Integer(59);
        System.out.println(i01 == i02);
        System.out.println(i01 == i03);
        System.out.println(i03 == i04);
        System.out.println(i04 == i02);
    }

    @Test
    public void TestInteger2() {
        int i = 128;
        Integer i2 = 128;
        Integer i3 = new Integer(128);
        //Integer会自动拆箱为int，所以为true
        System.out.println(i == i2);
        System.out.println(i == i3);
        System.out.println("**************");

        Integer i5 = 127;//java在编译的时候,被翻译成-> Integer i5 = Integer.valueOf(127);
        Integer i6 = 127;
        System.out.println(i5 == i6);//true

        Integer i5s = 128;
        Integer i6s = 128;
        System.out.println(i5s == i6s);//false

        Integer ii5 = new Integer(127);
        System.out.println(i5 == ii5); //false
        Integer i7 = new Integer(128);
        Integer i8 = new Integer(123);
        System.out.println(i7 == i8);  //false
    }
}
