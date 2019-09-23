package com.p.c.threadtutorial.char01;

/**
 * Created by p on 16/12/27.

 */
public class AliveThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("run方法中是否存活" + "   "  + Thread.currentThread().isAlive());
    }
}
