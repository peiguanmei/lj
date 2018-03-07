package com.p.thread2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Thread1 tm1 = new Thread1("A");
//        Thread1 tm2 = new Thread1("B");
//        tm1.start();
//        tm2.start();

//        Thread tm3 = new Thread(new Thread2("A"));
//        Thread tm4 = new Thread(new Thread2("B"));
//        tm3.start();
//        tm4.start();
//        new Thread(new Thread2("c")).start();
//        new Thread(new Thread2("D")).start();

    }
}


class Thread1 extends Thread {
    private String name;

    public Thread1(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name+"运行: "+i);
            try {
                Thread.sleep((long) (Math.random()*10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 implements Runnable {

    private String name;

    public Thread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name+"运行: "+i);
            try {
                Thread.sleep((long) (Math.random()*10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}