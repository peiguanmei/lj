package com.p.c.threadtutorial.char02;

/**
 * Created by p on 17/1/1.

 */
public class PublicVarThreadA extends Thread {

    private PublicVar publicVar;
    public PublicVarThreadA(PublicVar publicVar){
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
