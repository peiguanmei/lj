package com.p.c.threadtutorialtest.char01test;

import com.p.c.threadtutorial.char01.SleepThread;
import junit.framework.TestCase;

/**
 * Created by p on 16/12/27.

 */
public class SleepThreadTest extends TestCase {
    public void testRun() throws Exception {
        SleepThread sleepThread = new SleepThread();
        System.out.println("begin = " + System.currentTimeMillis());
//        sleepThread.run();
        sleepThread.start();
        System.out.println("end = " + System.currentTimeMillis());

        Thread.sleep(3000);
    }

}