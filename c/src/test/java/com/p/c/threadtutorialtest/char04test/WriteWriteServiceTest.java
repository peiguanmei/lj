package com.p.c.threadtutorialtest.char04test;

import com.p.c.threadtutorial.char04.WriteWriteService;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/28.

 */
public class WriteWriteServiceTest extends TestCase {
    public void testWrite() throws Exception {
        WriteWriteService service = new WriteWriteService();
        Thread a = new Thread(service::write);
        a.setName("A");
        Thread b = new Thread(service::write);
        b.setName("B");

        a.start();
        b.start();
        Thread.sleep(1000 * 30);
    }

}