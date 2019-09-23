package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.MyObject;
import com.p.c.threadtutorial.char02.SynchronizedMethodThread;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/1.

 */
public class SynchronizedMethodThreadTest extends TestCase {
    public void testRun() throws Exception {
        MyObject object = new MyObject();
        SynchronizedMethodThread a = new SynchronizedMethodThread(object);
        a.setName("A");
        SynchronizedMethodThread b = new SynchronizedMethodThread(object);
        b.setName("B");

        a.start();
        b.start();

        Thread.sleep(1000 * 15);
    }

}