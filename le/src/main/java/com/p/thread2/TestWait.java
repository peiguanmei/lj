package com.p.thread2;

public class TestWait implements Runnable{

    private String name;
    private Object prev;
    private Object self;

    public TestWait(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.println(name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        TestWait ta = new TestWait("A", c, a);
        TestWait tb = new TestWait("B", a, b);
        TestWait tc = new TestWait("C", b, c);

        new Thread(ta).start();
        new Thread(tb).start();
        new Thread(tc).start();
    }
}
