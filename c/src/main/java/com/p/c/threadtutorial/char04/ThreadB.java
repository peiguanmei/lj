package com.p.c.threadtutorial.char04;

/**
 * Created by p on 17/1/26.

 */
public class ThreadB extends Thread{

    private MyConditionMoreService service;

    public ThreadB(MyConditionMoreService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodB();
    }
}
