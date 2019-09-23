package com.p.c.threadtutorial.char02;

/**
 * Created by p on 17/1/1.

 */
public class SynchronizedMethodThread extends Thread{

    private MyObject object;

    public SynchronizedMethodThread(MyObject object){
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        if(Thread.currentThread().getName().equals("A")){
            object.methodA();
        }else{
            object.methodB();
        }
    }
}
