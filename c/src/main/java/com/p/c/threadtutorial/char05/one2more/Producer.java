package com.p.c.threadtutorial.char05.one2more;

/**
 * Created by p on 17/2/1.

 */
public class Producer implements Runnable{

    private MyQueue queue;

    public Producer(MyQueue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        for (;;) {
            queue.push(System.currentTimeMillis());
        }
    }
}
