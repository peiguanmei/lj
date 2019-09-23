package com.p.c.reflectiontutorialtest;

import com.p.c.reflectiontutorial.MyList;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/9.

 */
public class MyListTest extends TestCase {

    public void testGeneric() throws Exception{
        Class clz = MyList.class;
        System.out.println(clz.getTypeParameters()[0]);
    }
}