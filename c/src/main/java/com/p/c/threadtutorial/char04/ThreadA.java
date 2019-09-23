package com.p.c.threadtutorial.char04;

/**
 * Created by p on 17/1/26.

 */
public class ThreadA extends Thread{

    private MyConditionMoreService service;

    public ThreadA(MyConditionMoreService service){
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
