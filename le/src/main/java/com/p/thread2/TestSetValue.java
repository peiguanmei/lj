package com.p.thread2;

import java.util.Random;

public class TestSetValue {

    public static void main(String[] args) {
//        Thread td = new Thread(new ThreadA(new Work()));
//        td.start();

//        new Thread(new ThreadB("B")).start();

    }
}


class Data {
    public int value = 0;
}

class Work {
    public void process(Data data, Integer... numbers) {
        for (int n : numbers) {
            data.value += n;
        }
    }
}

class ThreadA implements Runnable{

    Work work;

    public ThreadA(Work work) {
        this.work = work;
    }

    @Override
    public void run() {
        Random random = new Random();
        Data data = new Data();
        int n1 = random.nextInt(1000);
        int n2 = random.nextInt(2000);
        int n3 = random.nextInt(3000);
//        List list = null;
//        list.add(n1);
//        list.add(n2);
//        list.add(n3);
        work.process(data, n1, n2, n3);
        System.out.println(String.valueOf(n1)+" : "+String.valueOf(n2)+" : "+String.valueOf(n3)+" : "+String.valueOf(data.value));
    }
}

class ThreadB implements Runnable {

    private String name;

    public ThreadB(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start");
    }
}