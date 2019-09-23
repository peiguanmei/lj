package com.p.c.threadtutorial.char05.more2more.value;

/**
 * Created by p on 17/2/1.

 */
public class Producer {

    private String lock;

    public Producer(String lock) {
        this.lock = lock;
    }

    public void setValue() throws InterruptedException {
        synchronized (lock) {
            if (!ValueObject.value.equals("")) {
                System.out.println("生产者 " + Thread.currentThread().getName() + " WAITING了★");
                lock.wait();
            }
            System.out.println("生产者 " + Thread.currentThread().getName() + " RUNNABLE了");
            String value = System.currentTimeMillis() + "_" + System.nanoTime();
            ValueObject.value = value;
            lock.notifyAll();
        }

    }
}
