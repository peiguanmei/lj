package com.p.c.threadtutorialtest.char01test;

import com.p.c.threadtutorial.char01.ExampleInterruptThread;
import junit.framework.TestCase;

/**
 * Created by p on 16/12/27.

 */
public class ExampleInterruptThreadTest extends TestCase {
    public void testRun() throws Exception {
        ExampleInterruptThread thread = new ExampleInterruptThread();
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }

}