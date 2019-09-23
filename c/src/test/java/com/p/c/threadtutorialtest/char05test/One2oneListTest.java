package com.p.c.threadtutorialtest.char05test;

import com.p.c.threadtutorial.char05.one2one.list.Customer;
import com.p.c.threadtutorial.char05.one2one.list.MyQueue;
import com.p.c.threadtutorial.char05.one2one.list.Producer;
import junit.framework.TestCase;

/**
 * Created by p on 17/2/1.

 */
public class One2oneListTest extends TestCase{

    public void testList() throws Exception {
        MyQueue queue = new MyQueue();

        new Thread(new Customer(queue)).start();
        new Thread(new Producer(queue)).start();

    }
}
