package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.SynBlockService;
import com.p.c.threadtutorial.char02.SynBlockThreadA;
import com.p.c.threadtutorial.char02.SynBlockThreadB;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/3.

 */
public class SynBlockServiceTest extends TestCase {
    public void testSetUSernamePassword() throws Exception {
        SynBlockService service = new SynBlockService();
        SynBlockThreadA a = new SynBlockThreadA(service);
        a.setName("A");
        a.start();

        SynBlockThreadB b = new SynBlockThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(1000 * 7);

    }

}