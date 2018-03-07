package com.p.statictest;

/**
 * Created by p on 2017/3/29.
 * 静态资源是类初始化的时候加载的，而非静态资源是类new的时候加载的
 * 1、静态方法能不能引用非静态资源？不能，new的时候才会产生的东西，对于初始化后就存在的静态资源来说，根本不认识它。
 * 2、静态方法里面能不能引用静态资源？可以，因为都是类初始化的时候加载的，大家相互都认识。
 * 3、非静态方法里面能不能引用静态资源？可以，非静态方法就是实例方法，那是new之后才产生的，那么属于类的内容它都认识。
 */
public class StaticDemo1 {
     public int i = 1;

     public static void main(String[] args)
     {
         //i = 1;
     }
}
