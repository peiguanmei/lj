package com.p.finaltest;

import org.omg.CORBA.PRIVATE_MEMBER;

public class FinalTest {
    
    public static void main(String[] args) {
        String name = "p";
        String grade = "4";
        final String name2 = "p";
        final String grade2 = "4";
        
        String userInfo = name + grade; //编译后此处依然是name和grade变量,由于country和name都是普通的变量，编译器无法在编译时直接确定userInfo的值
        String userInfo2 = name2 + grade2; //编译后此处直接变成p4,final修饰符修饰的变量在由于其本身的特性，在编译期就能直接确定其值，且此值不可变
        String user = "pp" + "44";      //编译后此处直接变成pp44
    }

}
