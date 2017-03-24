package com.p.antinotion;

import java.lang.reflect.Method;

/**
 * Created by p on 2017/3/7.
 */
public class Test {
    @SuppressWarnings("deprecation")
    public void work() {
        People people = new Child();
        people.work();
    }

    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.p.antinotion.Child");
            boolean isExist = c.isAnnotationPresent(Self.Description.class);
            if (isExist) {
                Self.Description d = (Self.Description) c.getAnnotation(Self.Description.class);
                System.out.println(d.desc()+"----"+d.author());
            }

            Method[] ms = c.getMethods();
            for (Method m : ms) {
                boolean isExist2 = m.isAnnotationPresent(Self.Description.class);
                if (isExist2) {
                    Self.Description d2 = m.getAnnotation(Self.Description.class);
                    System.out.println(d2.desc()+"---"+d2.author());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
