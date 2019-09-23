package com.p.c.threadtutorial.char04;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by p on 17/1/27.

 */
public class HoldCountService {
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println("ServiceMethod1 getHoldCount=" + lock.getHoldCount());
            serviceMethod2();
        }finally {
            lock.unlock();
        }
    }

    public void serviceMethod2(){
        try {
            lock.lock();
            System.out.println("ServiceMethod2 getHoldCount=" + lock.getHoldCount());
        }finally {
            lock.unlock();
        }
    }



}
