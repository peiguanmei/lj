package com.p.c.threadtutorial.char03;

/**
 * Created by byhieg on 17/1/11.
 * Mail to byhieg@gmail.com
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
