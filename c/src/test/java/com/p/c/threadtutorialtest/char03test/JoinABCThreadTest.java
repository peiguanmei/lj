package com.p.c.threadtutorialtest.char03test;

import com.p.c.threadtutorial.char03.JoinThreadA;
import com.p.c.threadtutorial.char03.JoinThreadB;
import com.p.c.threadtutorial.char03.JoinThreadC;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/11.

 */
public class JoinABCThreadTest extends TestCase {

    public void testRun() throws Exception{
        JoinThreadB b = new JoinThreadB();

        JoinThreadA a = new JoinThreadA(b);
        a.start();

        Thread.sleep(1000);
        JoinThreadC c = new JoinThreadC(b);
        c.start();

        Thread.sleep(1000 * 10);
    }
}
