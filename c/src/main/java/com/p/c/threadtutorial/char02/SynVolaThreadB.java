package com.p.c.threadtutorial.char02;

/**
 * Created by p on 17/1/5.

 */
public class SynVolaThreadB extends Thread{

    private RunService service;

    public SynVolaThreadB(RunService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.stopMethod();
    }
}
