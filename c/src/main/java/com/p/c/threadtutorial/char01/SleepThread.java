package com.p.c.threadtutorial.char01;

/**
 * Created by p on 16/12/27.

 */
public class SleepThread extends Thread{

    @Override
    public void run() {
        try{
            super.run();
            System.out.println("run threadName=" + currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName=" + currentThread().getName() +  " end");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
