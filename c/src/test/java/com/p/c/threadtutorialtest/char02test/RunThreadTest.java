package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.RunThread;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/5.

 */
public class RunThreadTest extends TestCase {
    public void testRun() throws Exception {
        RunThread thread = new RunThread();
        thread.start();
        Thread.sleep(1000);
        thread.setRunning(false);
        System.out.println("已经赋值为false");

        Thread.sleep(1000 * 3);
    }

}