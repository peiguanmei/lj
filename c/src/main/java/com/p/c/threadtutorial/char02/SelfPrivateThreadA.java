package com.p.c.threadtutorial.char02;

/**
 * Created by p on 17/1/1.

 */
public class SelfPrivateThreadA  extends Thread{
    private HasSelfPrivateNum num;


    public SelfPrivateThreadA(HasSelfPrivateNum num){
        this.num = num;
    }
    @Override
    public void run() {
        super.run();
        num.addI("a");
    }
}
