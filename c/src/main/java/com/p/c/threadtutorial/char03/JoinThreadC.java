package com.p.c.threadtutorial.char03;

/**
 * Created by p on 17/1/11.

 */
public class JoinThreadC extends Thread{
    private JoinThreadB joinThreadB;
    public JoinThreadC(JoinThreadB joinThreadB){
        this.joinThreadB = joinThreadB;
    }

    @Override
    public void run() {
        joinThreadB.bService();
    }
}
