package com.p.c.threadtutorialtest.char01test;

import com.p.c.threadtutorial.char01.SleepInterruptThread;
import junit.framework.TestCase;

/**
 * Created by p on 16/12/27.

 */
public class SleepInterruptThreadTest extends TestCase {
    public void testRun() throws Exception {
        try{
            SleepInterruptThread thread = new SleepInterruptThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }

}