package com.p.c.threadtutorialtest.char05test;

import com.p.c.threadtutorial.char05.more2more.value.Customer;
import com.p.c.threadtutorial.char05.more2more.value.Producer;
import junit.framework.TestCase;

/**
 * Created by p on 17/2/1.

 */
public class More2moreValueTest extends TestCase{
    public void testValue() throws Exception {
        String lock = "lock";

        Producer producer = new Producer(lock);
        Customer customer = new Customer(lock);

        Thread [] pThread = new Thread[2];
        Thread [] cThread = new Thread[2];

        for (int i = 0 ; i < 2;i++){
            pThread[i] = new Thread(()->{
                try {
                    for (int j = 0 ; j < 4;j++) {
                        producer.setValue();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            pThread[i].setName("生产者" + (i + 1));
            pThread[i].start();

            cThread[i] = new Thread(()->{
                try {
                    for (int j = 0 ; j< 4 ;j++){
                        customer.getValue();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            cThread[i].setName("消费者" + (i + 1));
            cThread[i].start();
        }

        Thread.sleep(1000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for (Thread aThreadArray : threadArray) {
            System.out.println(aThreadArray.getName() + " " + aThreadArray.getState());
        }



    }


}
