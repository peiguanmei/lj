package com.p.c.threadtutorialtest.concurrenttest.blockingtest;

import com.p.c.threadtutorial.concurrent.blocking.ArrayBlock;
import com.p.c.threadtutorial.concurrent.blocking.Costumer;
import com.p.c.threadtutorial.concurrent.blocking.Producer;
import junit.framework.TestCase;

/**
 * Created by p on 17/5/3.

 */
public class ArrayBlockTest extends TestCase {
    ArrayBlock block;
    public void setUp() throws Exception {
        super.setUp();
        block = new ArrayBlock(2);
    }

    public void tearDown() throws Exception {
    }


    public void testBlocking() throws Exception {
        Producer producer = new Producer(block);
        Costumer costumer = new Costumer(block);
        producer.start();
        costumer.start();
        producer.join();
        costumer.join();

    }
}