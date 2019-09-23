package com.p.c.threadtutorialtest.char05test;

import cn.byhieg.threadtutorial.char05.one2one.list.Customer;
import cn.byhieg.threadtutorial.char05.one2one.list.MyQueue;
import cn.byhieg.threadtutorial.char05.one2one.list.Producer;
import junit.framework.TestCase;

/**
 * Created by byhieg on 17/2/1.
 * Mail to byhieg@gmail.com
 */
public class One2oneListTest extends TestCase{

    public void testList() throws Exception {
        MyQueue queue = new MyQueue();

        new Thread(new Customer(queue)).start();
        new Thread(new Producer(queue)).start();

    }
}
