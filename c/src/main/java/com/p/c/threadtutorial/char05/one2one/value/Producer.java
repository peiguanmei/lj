package com.p.c.threadtutorial.char05.one2one.value;

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
                lock.wait();
            }
            String value = System.currentTimeMillis() + "_" + System.nanoTime();
            System.out.println("set的值 " + value);
            ValueObject.value = value;
            lock.notify();
        }

    }
}
