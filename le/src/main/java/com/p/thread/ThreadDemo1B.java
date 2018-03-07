package com.p.thread;

public class ThreadDemo1B implements Runnable{

    @Override
    public void run() {
        new ThreadDemo1A().run();
        new Thread(new ThreadDemo1A(),"name_thread2").run();
        new Thread(new ThreadDemo1A(),"name_thread3").start();
        new Thread(new ThreadDemo1A(),"name_thread4").run();
        new Thread(new ThreadDemo1A(),"name_thread5").start();
        System.out.println("thread run start"); 
    }

}
