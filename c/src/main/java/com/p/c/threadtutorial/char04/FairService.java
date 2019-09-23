package com.p.c.threadtutorial.char04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by p on 17/1/27.

 */
public class FairService {
    private Lock lock;
    private boolean isFair;


    public FairService(boolean isFair){
        lock = new ReentrantLock(isFair);
    }

    public void setFair(boolean fair) {
        isFair = fair;
    }

    public void serviceMethod(){
        try{
            lock.lock();
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "获得锁定");
        }finally {
            lock.unlock();
        }
    }
}
