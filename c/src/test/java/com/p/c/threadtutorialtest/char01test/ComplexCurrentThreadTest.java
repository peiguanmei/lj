package com.p.c.threadtutorialtest.char01test;

import com.p.c.threadtutorial.char01.ComplexCurrentThread;
import junit.framework.TestCase;

/**
 * Created by p on 16/12/27.

 */
public class ComplexCurrentThreadTest extends TestCase {


    public void testRun() throws Exception {
        ComplexCurrentThread thread = new ComplexCurrentThread();
        thread.setName("p");
        new Thread(thread).start();

        Thread.sleep(3000);
    }

}