package com.p.c.threadtutorialtest.char01test;

import com.p.c.threadtutorial.char01.ExampleCurrentThread;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2016/12/27.
 * Mail p@gmail.com
 */
public class ExampleCurrentThreadTest extends TestCase {

    public void testInit() throws Exception{
        ExampleCurrentThread thread = new ExampleCurrentThread();
    }

    public void testRun() throws Exception {
        ExampleCurrentThread thread = new ExampleCurrentThread();
        thread.start();

        Thread.sleep(1000);

    }

}