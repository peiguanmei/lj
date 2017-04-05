package com.p.thread;

public class ThreadDemo1A implements Runnable{

    @Override
    public void run() {
       System.out.println("demo1A"+Thread.currentThread().getName()); 
       System.out.println("------"+Thread.currentThread().getId());
    }

}
