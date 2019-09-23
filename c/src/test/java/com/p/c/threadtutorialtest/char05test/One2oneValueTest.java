package com.p.c.threadtutorialtest.char05test;

import com.p.c.threadtutorial.char05.one2one.value.Customer;
import com.p.c.threadtutorial.char05.one2one.value.Producer;
import junit.framework.TestCase;

/**
 * Created by p on 17/2/1.

 */
public class One2oneValueTest extends TestCase {

    public void testValue() throws Exception{
        String lock = "lock";
        Producer producer = new Producer(lock);
        Customer customer = new Customer(lock);

        new Thread(() -> {
            try {
                for (;;) {
                    producer.setValue();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


        new Thread(()->{
            try {
                for (;;) {
                    customer.getValue();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(1000 * 5);
    }

}
