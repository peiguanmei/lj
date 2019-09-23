package com.p.c.threadtutorial.char05.one2one.value;

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
            if (ValueObject.value.equals("")){
                lock.wait();
            }
            String value = ValueObject.value;
            ValueObject.value = "";
            System.out.println("取到的值" + value);
            lock.notify();
        }
    }
}
