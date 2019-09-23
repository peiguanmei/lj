package com.p.c.threadtutorialtest.char05test;


import com.p.c.threadtutorial.char05.more2one.Customer;
import com.p.c.threadtutorial.char05.more2one.MyQueue;
import com.p.c.threadtutorial.char05.more2one.Producer;
import junit.framework.TestCase;

/**
 * Created by p on 17/2/1.

 */
public class More2oneListTest extends TestCase {

    public void testList() throws Exception{
        MyQueue queue = new MyQueue();

        new Thread(new Producer(queue)).start();
        new Thread(new Producer(queue)).start();
        new Thread(new Producer(queue)).start();
        new Thread(new Producer(queue)).start();
        new Thread(new Producer(queue)).start();

        new Thread(new Customer(queue)).start();

        Thread.sleep(1000 * 3);
    }
}
