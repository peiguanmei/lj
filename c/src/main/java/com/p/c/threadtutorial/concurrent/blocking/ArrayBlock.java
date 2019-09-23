package com.p.c.threadtutorial.concurrent.blocking;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by byhieg on 17/5/3.
 * Mail to byhieg@gmail.com
 */
public class ArrayBlock {

    private BlockingQueue<String> blockingQueue;

    public ArrayBlock(int index) {
        switch (index) {
            case 0:
                blockingQueue = new ArrayBlockingQueue<String>(3);
                break;
            case 1:
                blockingQueue = new LinkedBlockingQueue<>();
                break;
            case 2:
                blockingQueue = new SynchronousQueue<>();
                break;
        }
    }

    public BlockingQueue<String> getBlockingQueue() {
        return blockingQueue;
    }
}
