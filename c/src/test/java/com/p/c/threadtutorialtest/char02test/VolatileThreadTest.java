package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.VolatileThread;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/5.

 */
public class VolatileThreadTest extends TestCase {
    public void testRun() throws Exception {
        VolatileThread[] threads = new VolatileThread[100];
        for (int i = 0 ; i < 100; i++){
            threads[i] = new VolatileThread();
        }
        for (int i = 0 ; i < 100 ; i++){
            threads[i].start();
        }

        Thread.sleep(1000 * 15);
    }

}