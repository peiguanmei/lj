package com.p.c.threadtutorial.char02;

/**
 * Created by p on 17/1/5.

 */
public class SynVolaThreadA extends Thread{

    private RunService service;
    public SynVolaThreadA(RunService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.runMethod();
    }
}
