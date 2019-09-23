package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.DoubleSynThreadA;
import com.p.c.threadtutorial.char02.DoubleSynThreadB;
import com.p.c.threadtutorial.char02.ObjectService;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/3.

 */
public class ObjectServiceTest extends TestCase {
    public void testServiceMethod() throws Exception {
        ObjectService objectService = new ObjectService();
        DoubleSynThreadA a = new DoubleSynThreadA(objectService);
        a.setName("A");
        a.start();

        DoubleSynThreadB b = new DoubleSynThreadB(objectService);
        b.setName("B");
        b.start();

        Thread.sleep(1000 * 3);
    }



}