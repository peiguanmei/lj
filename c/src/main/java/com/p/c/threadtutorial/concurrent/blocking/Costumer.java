package com.p.c.threadtutorial.concurrent.blocking;

import java.util.concurrent.BlockingQueue;

/**
 * Created by p on 17/5/3.

 */
public class Costumer extends Thread{

    private BlockingQueue<String> blockingQueue;

    public Costumer(ArrayBlock arrayBlock) {
        blockingQueue = arrayBlock.getBlockingQueue();
        this.setName("Costumer");
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            try {
                Thread.sleep(5000);
                String str = blockingQueue.take();
                System.out.println(getName() + " 取出数据 " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
