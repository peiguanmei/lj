package com.p.c.threadtutorialtest.char03test;

import com.p.c.threadtutorial.char03.NotifyThread;
import com.p.c.threadtutorial.char03.WaitThread;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/1/10.
 * Mail p@gmail.com
 */
public class WaitThreadTest extends TestCase {

    public void testWait()throws Exception{
        Object lock = new Object();
        new WaitThread(lock).start();
        Thread.sleep(50);
        new NotifyThread(lock).start();

        Thread.sleep(1000 * 15);
    }

}