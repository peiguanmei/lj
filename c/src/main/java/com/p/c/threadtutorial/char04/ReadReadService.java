package com.p.c.threadtutorial.char04;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by p on 17/1/28.

 */
public class ReadReadService {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();


    public void read(){
        try{
            try{
                lock.readLock().lock();
                System.out.println("获得读锁" + Thread.currentThread().getName() +
                " " + System.currentTimeMillis());
                Thread.sleep(1000 * 10);
            }finally {
                lock.readLock().unlock();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
