package com.p.c.threadtutorial.concurrent.blocking;

import java.util.concurrent.BlockingQueue;

/**
 * Created by p on 17/5/3.

 */
public class Producer extends Thread {

    private BlockingQueue<String> blockingQueue;
    @Override
    public void run() {
        super.run();
        for (int i = 0 ; i < 5;i++) {
            try {
                blockingQueue.put(i + "");
                System.out.println(getName() + " 生产数据");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Producer(ArrayBlock arrayBlock){
        this.setName("Producer");
        blockingQueue = arrayBlock.getBlockingQueue();
    }
}
