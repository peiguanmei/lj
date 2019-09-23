package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.RunService;
import com.p.c.threadtutorial.char02.SynVolaThreadA;
import com.p.c.threadtutorial.char02.SynVolaThreadB;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/5.

 */
public class RunServiceTest extends TestCase {
    public void testRunMethod() throws Exception {
        RunService service = new RunService();
        SynVolaThreadA threadA = new SynVolaThreadA(service);
        threadA.start();
        Thread.sleep(1000);
        SynVolaThreadB threadB = new SynVolaThreadB(service);
        threadB.start();
        System.out.println("已经发起停止的命令了");

        Thread.sleep(1000);
    }

}