package com.p.c.threadtutorialtest.char01test;

import com.p.c.threadtutorial.char01.ShareDataThread;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2016/12/27.
 * Mail p@gmail.com
 */
public class ShareDataThreadTest extends TestCase {
    public void testRun() throws Exception {
        ShareDataThread shareData = new ShareDataThread();
        new Thread(shareData,"A").start();
        new Thread(shareData,"B").start();
        new Thread(shareData,"C").start();
        new Thread(shareData,"D").start();
        new Thread(shareData,"E").start();


        Thread.sleep(1000);

    }

}