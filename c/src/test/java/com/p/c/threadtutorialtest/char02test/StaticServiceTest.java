package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.StaticService;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/3.

 */
public class StaticServiceTest extends TestCase {

    public void testPrint() throws Exception{
        new Thread(StaticService::printA).start();

        new Thread(StaticService::printB).start();

        new Thread(() -> new StaticService().printC()).start();

        Thread.sleep(1000 * 3);
    }

}