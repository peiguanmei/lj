package com.p.c.threadtutorial.char03;

/**
 * Created by p on 17/1/11.

 */
public class Add {
    private Object lock;
    public Add(Object lock){
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            MyList.list.add("anyString");
            lock.notifyAll();
        }
    }
}
