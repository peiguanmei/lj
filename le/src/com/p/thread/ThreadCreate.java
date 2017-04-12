package com.p.thread;

/**
 * Created by p on 2017/4/10.
 */
public class ThreadCreate {
    public static void main(String[] args) {
        Thread td = new Thread();
        Thread1 td1 = new Thread1();
        Thread td2 = new Thread(new Thread1());
        td.start();
        td2.start();
    }
}

class Thread1 implements Runnable{
    String str = "thread1";

    @Override
    public void run() {
        System.out.println(str);
    }
}
