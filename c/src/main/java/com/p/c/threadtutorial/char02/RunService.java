package com.p.c.threadtutorial.char02;

/**
 * Created by p on 17/1/5.

 */
public class RunService {

    volatile private boolean isContinueRun = true;

    public void runMethod() {

        while (isContinueRun == true) {
        }

        System.out.println("停下来了");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
