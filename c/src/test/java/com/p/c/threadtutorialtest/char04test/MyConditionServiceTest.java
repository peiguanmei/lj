package com.p.c.threadtutorialtest.char04test;

import com.p.c.threadtutorial.char04.MyConditionService;
import junit.framework.TestCase;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by p on 17/1/26.

 */
public class MyConditionServiceTest extends TestCase {

    public void testTestMethod() throws Exception {
        MyConditionService service = new MyConditionService();
        new Thread(service::testMethod).start();
        new Thread(service::testMethod).start();
        new Thread(service::testMethod).start();
        new Thread(service::testMethod).start();
        new Thread(service::testMethod).start();

        Lock lock = new ReentrantLock(true);
        lock.lockInterruptibly();
        Thread.sleep(1000 * 5);
    }

}