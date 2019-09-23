package com.p.c.threadtutorialtest.char03test;

import com.p.c.threadtutorial.char03.NotifyServiceThread;
import com.p.c.threadtutorial.char03.ServiceThread;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/1/10.
 * Mail p@gmail.com
 */
public class NotifyServiceThreadTest extends TestCase {
    public void testRun() throws Exception {
        Object lock = new Object();
        ServiceThread a = new ServiceThread(lock);
        a.start();
        Thread.sleep(1000);
        new NotifyServiceThread(lock).start();
        new NotifyServiceThread(lock).start();

        Thread.sleep(1000 * 10);
    }

}