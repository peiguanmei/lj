package com.p.c.threadtutorialtest.char04test;

import com.p.c.threadtutorial.char04.WriteReadService;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/28.

 */
public class WriteReadServiceTest extends TestCase {
    public void testWrite() throws Exception {

        WriteReadService service = new WriteReadService();
        Thread a = new Thread(service::write);
        a.setName("A");
        a.start();
        Thread.sleep(1000);

        Thread b = new Thread(service::read);
        b.setName("B");
        b.start();

        Thread.sleep(1000 * 30);
    }

}