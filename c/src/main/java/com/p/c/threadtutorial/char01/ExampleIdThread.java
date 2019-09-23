package com.p.c.threadtutorial.char01;

/**
 * Created by p on 16/12/27.

 */
public class ExampleIdThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println(currentThread().getName() + " +++" + currentThread().getId());
    }
}
