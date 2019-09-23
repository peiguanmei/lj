package com.p.c.threadtutorial.char05.more2more.value;

/**
 * Created by p on 17/2/1.

 */
public class Customer {

    private String lock;

    public Customer(String lock) {
        this.lock = lock;
    }

    public void getValue() throws InterruptedException{
        synchronized (lock) {
            while (ValueObject.value.equals("")){
                System.out.println("消费者 "+ Thread.currentThread().getName() + " WAITING了☆");
                lock.wait();
            }
            System.out.println("消费者 " + Thread.currentThread().getName() + " RUNNING了");
            String value = ValueObject.value;
            ValueObject.value = "";
            lock.notifyAll();
        }
    }
}
