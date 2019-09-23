package com.p.c.threadtutorialtest.char05test;

import com.p.c.threadtutorial.char05.more2more.list.Customer;
import com.p.c.threadtutorial.char05.more2more.list.MyQueue;
import com.p.c.threadtutorial.char05.more2more.list.Producer;
import junit.framework.TestCase;

/**
 * Created by p on 17/2/1.

 */
public class More2moreListTest extends TestCase {

    public void testList() throws Exception{
        MyQueue queue = new MyQueue();
        new Thread(new Producer(queue)).start();
        new Thread(new Producer(queue)).start();
        new Thread(new Producer(queue)).start();
        new Thread(new Producer(queue)).start();
        new Thread(new Producer(queue)).start();


        new Thread(new Customer(queue)).start();
        new Thread(new Customer(queue)).start();
        new Thread(new Customer(queue)).start();
        new Thread(new Customer(queue)).start();
        new Thread(new Customer(queue)).start();


        Thread.sleep(1000 * 5);
    }

}
