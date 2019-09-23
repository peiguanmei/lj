package com.p.c.threadtutorialtest.char04test;

import com.p.c.threadtutorial.char04.ReadWriteService;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/28.

 */
public class ReadWriteServiceTest extends TestCase {
    public void testRead() throws Exception {

        ReadWriteService service = new ReadWriteService();
        Thread a = new Thread(service::read);
        a.setName("AA");
        a.start();
        Thread.sleep(1000);

        Thread b = new Thread(service::write);
        b.setName("BB");


        b.start();
        Thread.sleep(1000 * 30);
    }

}