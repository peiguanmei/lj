package com.p.lambda;

import org.junit.Test;

public class TestLambda {
    //替代匿名内部类
    @Test
    public void threadNorm() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("before java8 imp thread class");
            }
        }).start();
    }

    @Test
    public void threadLam() {
        new Thread(() -> System.out.println("in java8 imp a thread class")).start();
    }
}
