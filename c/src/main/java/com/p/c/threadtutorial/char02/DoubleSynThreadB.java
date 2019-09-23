package com.p.c.threadtutorial.char02;

/**
 * Created by p on 17/1/3.

 */
public class DoubleSynThreadB extends Thread{

    private ObjectService objectService;

    public DoubleSynThreadB(ObjectService objectService){
        this.objectService = objectService;

    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethodB();
    }
}
