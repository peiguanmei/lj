package com.p.reflect;

public class TestReflect {
    public static void main(String[] args) {
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        
        
        try {
            class1 = Class.forName("com.p.reflect.TestReflect");
            class2 = new TestReflect().getClass();
            class3 = TestReflect.class;
            System.out.println(class1.getName());
            System.out.println(class2.getName());
            System.out.println(class3.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
