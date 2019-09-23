package com.p.c.threadtutorialtest.char04test;

import com.p.c.threadtutorial.char04.HoldCountService;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/27.

 */
public class HoldCountServiceTest extends TestCase {
    public void testServiceMethod1() throws Exception {

        HoldCountService service = new HoldCountService();
        service.serviceMethod1();

        Thread.sleep(1000 * 5);
    }

}