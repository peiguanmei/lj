package com.p.c.threadtutorialtest.char01test;

import com.p.c.threadtutorial.char01.ExampleIdThread;
import junit.framework.TestCase;

/**
 * Created by p on 16/12/27.

 */
public class ExampleIdThreadTest extends TestCase {
    public void testRun() throws Exception {
        ExampleIdThread thread = new ExampleIdThread();
        thread.start();
        Thread.sleep(1000);
    }

}