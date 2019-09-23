package com.p.c.threadtutorial.char05.one2one.list;

/**
 * Created by p on 17/2/1.

 */
public class Customer implements Runnable {

    private MyQueue queue;

    public Customer(MyQueue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        for (;;) {
            System.out.println(queue.pop());
        }
    }
}
