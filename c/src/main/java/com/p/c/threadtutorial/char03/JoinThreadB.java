package com.p.c.threadtutorial.char03;

/**
 * Created by p on 17/1/11.

 */
public class JoinThreadB extends Thread{

    @Override
    public void run() {
        super.run();
        try{
            System.out.println(" b run begin timer=" + System.currentTimeMillis());
            Thread.sleep(1000 * 2);
            System.out.println(" b run end timer=" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void bService(){
        System.out.println(" 打印了bService timer= " + System.currentTimeMillis());
    }
}
