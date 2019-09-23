package com.p.c.collectiontutorialtest;

import com.p.c.collectiontutorial.listtutorial.LinkedListDemo;
import junit.framework.TestCase;

/**
 * Created by p on 17/2/15.

 */
public class LinkedListDemoTest extends TestCase {

    public void testList() throws Exception {
        LinkedListDemo demo = new LinkedListDemo();
        demo.getList().add(111);
        System.out.println(demo.getList().get(0));
        demo.getList().remove(0);
    }

}