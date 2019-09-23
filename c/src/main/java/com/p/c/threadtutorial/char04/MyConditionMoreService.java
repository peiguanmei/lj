package com.p.c.threadtutorial.char04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by p on 17/1/26.

 */
public class MyConditionMoreService {

    private Lock lock = new ReentrantLock();


    public void methodA(){
        try{
            lock.lock();
            System.out.println("methodA begin ThreadName=" + Thread.currentThread().getName() +
                    " time=" + System.currentTimeMillis());
            Thread.sleep(1000 * 5);

            System.out.println("methodA end ThreadName=" + Thread.currentThread().getName() +
                    " time=" + System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void methodB(){
        try{
            lock.lock();
            System.out.println("methodB begin ThreadName=" + Thread.currentThread().getName() +
                    " time=" + System.currentTimeMillis());
            Thread.sleep(1000 * 5);

            System.out.println("methodB end ThreadName=" + Thread.currentThread().getName() +
                    " time=" + System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


}
