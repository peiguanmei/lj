package com.p.c.threadtutorial.char04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by p on 17/1/26.

 */
public class MyConditionService {

    private Lock lock = new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for (int i = 0 ;i < 5;i++){
            System.out.println("ThreadName = " + Thread.currentThread().getName() + (" " + (i + 1)));
        }
        lock.unlock();
    }
}
