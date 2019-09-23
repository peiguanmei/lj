package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.SynchronizedServiceThread;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/1/3.
 * Mail p@gmail.com
 */
public class SynchronizedServiceThreadTest extends TestCase {
    public void testRun() throws Exception {
        SynchronizedServiceThread thread = new SynchronizedServiceThread();
        thread.start();

        Thread.sleep(1000 * 3);
    }

}