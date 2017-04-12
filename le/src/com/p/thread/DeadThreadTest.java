package com.p.thread;

/**
 * Created by p on 2017/4/10.
 */
public class DeadThreadTest {
    private int flag;
    private final Object left = new Object();
    private final Object right = new Object();

    public void leftRight() throws InterruptedException {
        synchronized (left) {
            Thread.sleep(2000);
            synchronized (right) {
                System.out.println("left Right");
            }
        }
    }

    public void rightLeft() throws InterruptedException {
        synchronized (right) {
            Thread.sleep(2000);
            synchronized (left) {
                System.out.println("right Left");
            }
        }
    }

    public static void main(String[] args) {
//        DeadThreadTest dt = new DeadThreadTest();
//        Thread td10 = new Thread(new Thread10(dt));
//        Thread td11 = new Thread(new Thread11(dt));
//        td10.start();
//        td11.start();

        Thread t10 = new Thread(new Thread12(0));
        Thread t11 = new Thread(new Thread12(1));
        t10.start();
        t11.start();
    }

}

class Thread10 implements Runnable {

    private DeadThreadTest dl;

    public Thread10(DeadThreadTest dl) {
        this.dl = dl;
    }

    @Override
    public void run() {
        try {
            dl.leftRight();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Thread11 implements Runnable {

    private DeadThreadTest d1;

    public Thread11(DeadThreadTest d1) {
        this.d1 = d1;
    }

    @Override
    public void run() {
        try {
            d1.rightLeft();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread12 implements Runnable {
    private int flag;
    public static Object o1 = new Object();
    public static Object o2 = new Object();

    public Thread12(int flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag == 0) {
            synchronized (o1) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("o1");
                synchronized (o2) {
                    System.out.println("o1 o2");
                }
            }

        }
        if (flag == 1) {
            synchronized (o2) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("o2");
                synchronized (o1) {
                    System.out.println("o2 o1");
                }
            }
        }

    }
}
