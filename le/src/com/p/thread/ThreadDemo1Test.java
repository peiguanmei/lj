package com.p.thread;

public class ThreadDemo1Test {
    public static void main(String[] args) {
        new Thread(new ThreadDemo1B(),"name_thread1").start();
        new Thread(new ThreadDemo1B(),"name_thread7").run();
        new Thread(new ThreadDemo1B(),"name_thread6").start();
    }

}
