package com.p.c.threadtutorial.char04;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by p on 17/1/27.

 */
public class ConditionWaitNotifyService {

    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();


    public void await(){
        try{
            lock.lock();
            System.out.println("await的时间为 " + System.currentTimeMillis());
            condition.awaitUninterruptibly();
            System.out.println("await结束的时间" + System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


    public void signal(){
        try{
            lock.lock();
            System.out.println("sign的时间为" + System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
