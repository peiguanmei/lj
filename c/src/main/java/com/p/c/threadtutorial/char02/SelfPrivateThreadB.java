package com.p.c.threadtutorial.char02;

/**
 * Created by p on 17/1/1.

 */
public class SelfPrivateThreadB extends Thread{
    private HasSelfPrivateNum num;


    public SelfPrivateThreadB(HasSelfPrivateNum num){
        this.num = num;
    }
    @Override
    public void run() {
        super.run();
        num.addI("b");
    }
}
