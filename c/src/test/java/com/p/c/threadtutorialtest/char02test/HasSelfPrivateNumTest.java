package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.HasSelfPrivateNum;
import com.p.c.threadtutorial.char02.SelfPrivateThreadA;
import com.p.c.threadtutorial.char02.SelfPrivateThreadB;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/1.

 */
public class HasSelfPrivateNumTest extends TestCase {
    public void testAddI() throws Exception {
        HasSelfPrivateNum numA = new HasSelfPrivateNum();
        HasSelfPrivateNum numB = new HasSelfPrivateNum();
        SelfPrivateThreadA threadA = new SelfPrivateThreadA(numA);
        threadA.start();
        SelfPrivateThreadB threadB = new SelfPrivateThreadB(numB);
        threadB.start();
        Thread.sleep(1000 * 3);
    }
}