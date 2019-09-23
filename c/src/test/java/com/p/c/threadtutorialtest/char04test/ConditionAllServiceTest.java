package com.p.c.threadtutorialtest.char04test;

import com.p.c.threadtutorial.char04.ConditionAllService;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/27.

 */
public class ConditionAllServiceTest extends TestCase {
    public void testAwaitA() throws Exception {
        ConditionAllService service = new ConditionAllService();
        Thread a = new Thread(service::awaitA);
        a.setName("A");
        a.start();

        Thread b = new Thread(service::awaitB);
        b.setName("B");
        b.start();

        Thread.sleep(1000 * 3);

        service.signAAll();

        Thread.sleep(1000 * 4);

    }

}