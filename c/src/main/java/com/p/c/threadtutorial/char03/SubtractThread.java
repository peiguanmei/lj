package com.p.c.threadtutorial.char03;

/**
 * Created by p on 17/1/11.

 */
public class SubtractThread extends Thread{
    private Subtract r;

    public SubtractThread(Subtract r){
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        r.subtract();
    }
}
