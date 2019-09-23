package com.p.c.threadtutorialtest.char01test;

import com.p.c.threadtutorial.char01.ExampleDaemonThread;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2016/12/28.
 * Mail p@gmail.com
 */
public class ExampleDaemonThreadTest extends TestCase {
    public void testRun() throws Exception {
        ExampleDaemonThread thread = new ExampleDaemonThread();
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(5000);
        System.out.println("我离开了thread对象也不在打印了，也就停止了");
    }

}