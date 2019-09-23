package com.p.c.threadtutorialtest.char01test;

import com.p.c.threadtutorial.char01.AliveOtherThread;
import junit.framework.TestCase;

/**
 * Created by p on 16/12/27.

 */
public class AliveOtherThreadTest extends TestCase {
    public void testRun() throws Exception {
        AliveOtherThread run = new AliveOtherThread();
        Thread thread = new Thread(run);
        System.out.println("main begin thread isAlive=" + thread.isAlive());
        thread.setName("p");
        thread.start();
        System.out.println("main end thread isAlive=" + thread.isAlive());

        Thread.sleep(3000);
    }

}