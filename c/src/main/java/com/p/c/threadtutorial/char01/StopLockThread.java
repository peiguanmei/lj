package com.p.c.threadtutorial.char01;

/**
 * Created by p on 16/12/28.

 */
public class StopLockThread extends Thread{

    private SynchronizedObject object;

    public StopLockThread(SynchronizedObject object){
        this.object = object;
    }


    @Override
    public void run() {
        super.run();
        object.printString("b","bbb");
    }
}
