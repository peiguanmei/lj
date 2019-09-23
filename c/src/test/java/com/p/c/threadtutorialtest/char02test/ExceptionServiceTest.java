package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.ExceptionService;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/5.

 */
public class ExceptionServiceTest extends TestCase {


    public void testGetFile() throws Exception{
        ExceptionService service = new ExceptionService();

        new Thread(()->{
            service.getFile();
        }).start();
        Thread.sleep(100);
        new Thread(()->{
            service.getFile();
        }).start();

        Thread.sleep(1000 * 10);
    }

}