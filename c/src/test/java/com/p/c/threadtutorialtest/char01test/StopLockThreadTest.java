package com.p.c.threadtutorialtest.char01test;

import com.p.c.threadtutorial.char01.StopLockThread;
import com.p.c.threadtutorial.char01.SynchronizedObject;
import junit.framework.TestCase;

/**
 * Created by p on 16/12/28.

 */
public class StopLockThreadTest extends TestCase {
    public void testRun() throws Exception {

        try{
            SynchronizedObject object = new SynchronizedObject();
            StopLockThread thread = new StopLockThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}