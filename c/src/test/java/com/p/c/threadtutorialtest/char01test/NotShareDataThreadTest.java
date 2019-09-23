package com.p.c.threadtutorialtest.char01test;

import com.p.c.threadtutorial.char01.NotShareDataThread;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2016/12/27.
 * Mail p@gmail.com
 */
public class NotShareDataThreadTest extends TestCase {

    public void testRun() throws Exception {
        NotShareDataThread a = new NotShareDataThread("A");
        NotShareDataThread b = new NotShareDataThread("B");
        NotShareDataThread c = new NotShareDataThread("C");

        a.start();
        b.start();
        c.start();

        Thread.sleep(1000);
    }

}