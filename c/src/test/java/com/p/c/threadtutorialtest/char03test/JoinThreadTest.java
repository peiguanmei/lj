package com.p.c.threadtutorialtest.char03test;

import com.p.c.threadtutorial.char03.JoinThread;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/11.

 */
public class JoinThreadTest extends TestCase {
    public void testRun() throws Exception {
        JoinThread joinThread = new JoinThread();
        joinThread.start();
        joinThread.join();
        System.out.println("我想当Join对象执行完毕后我再执行，我做到了");

    }

}