package com.p.c.threadtutorialtest.char04test;

import com.p.c.threadtutorial.char04.ReadReadService;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/28.

 */
public class ReadReadServiceTest extends TestCase {
    public void testRead() throws Exception {
        ReadReadService service = new ReadReadService();
        Thread a = new Thread(service::read);
        a.setName("A");

        Thread b = new Thread(service::read);
        b.setName("B");

        a.start();
        b.start();

    }

}