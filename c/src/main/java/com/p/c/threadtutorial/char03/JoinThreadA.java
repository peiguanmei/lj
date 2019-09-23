package com.p.c.threadtutorial.char03;

/**
 * Created by p on 17/1/11.

 */
public class JoinThreadA extends Thread {
    private JoinThreadB b;
    public JoinThreadA(JoinThreadB b){
        this.b = b;
    }

    @Override
    public void run() {
        super.run();
        try{
            synchronized (b){
                b.start();
                b.join();
                for (int i = 0 ; i < Integer.MAX_VALUE;i++){
                    String newString = new String();
                    Math.random();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
