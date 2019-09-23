package com.p.c.threadtutorial.char02;

/**
 * Created by p on 17/1/3.

 */
public class SynBlockThreadA extends Thread{

    private SynBlockService service;

    public SynBlockThreadA(SynBlockService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.setUSernamePassword("a","aa");
    }
}
