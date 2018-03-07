package com.p.thread2;

public class TestJoin {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name+" start ");
        BThread bt = new BThread();
        AThread at = new AThread(bt);
        try {
            bt.start();
            bt.sleep(1000);
            at.start();
            at.join(); //注释掉这行,main方法会提前结束,说明join只会停止当前线程的运行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+" end ");
    }
}

class BThread extends Thread {

    public BThread() {
        super("[BThread] Thread");
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " start");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " loop at " + i);
                sleep(1000);
            }
            System.out.println(name+" end ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class AThread extends Thread {

    BThread bt;

    public AThread(BThread bt) {
        super("[AThread] Thread");
        this.bt = bt;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" start ");
        try {
            bt.join();
            System.out.println(name+" end ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
