package com.p.c.threadtutorialtest.char04test;

import com.p.c.threadtutorial.char04.ConditionWaitNotifyService;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/27.

 */
public class ConditionWaitNotifyServiceTest extends TestCase {
    public void testAwait() throws Exception {
        ConditionWaitNotifyService service = new ConditionWaitNotifyService();
        new Thread(service::await).start();
        Thread.sleep(1000 * 3);
        service.signal();
        Thread.sleep(1000);
    }

}