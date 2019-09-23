package com.p.c.threadtutorial.char03;

/**
 * Created by p on 17/1/11.

 */
public class AddThread extends Thread{
    private Add p;
    public AddThread(Add p){
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        p.add();
    }
}
