package com.p.c.threadtutorial.char02;

/**
 * Created by p on 17/1/5.

 */
public class VolatileThread extends Thread{
    volatile public static int count;

    synchronized private static void addCount(){
        for (int i = 0 ; i < 100 ; i++){
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        super.run();
        addCount();
    }
}
