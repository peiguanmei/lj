package com.p.c.threadtutorialtest.char01test;

import com.p.c.threadtutorial.char01.AliveThread;
import junit.framework.TestCase;

/**
 * Created by p on 16/12/27.

 */
public class AliveThreadTest extends TestCase {
    public void testRun() throws Exception {
        AliveThread thread = new AliveThread();
        System.out.println("begin == " + thread.isAlive());
        thread.start();
        Thread.sleep(1000);
        System.out.println("end ==" + thread.isAlive());

        Thread.sleep(3000);
    }


}