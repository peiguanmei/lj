package com.p.c.threadtutorialtest.char03test;

import com.p.c.threadtutorial.char03.SynService;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/11.

 */
public class SynServiceTest extends TestCase {

    public void testDoSomething() throws Exception {
        Object object = new Object();

        new Thread(() -> new SynService(object).doSomething()).start();
        Thread.sleep(1000);
        new Thread(() -> new SynService(object).doSomething()).start();

        Thread.sleep(1000 * 15);
    }

}