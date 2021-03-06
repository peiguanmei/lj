package com.p.c.threadtutorial.char02;

/**
 * Created by shiqifeng on 2017/1/3.
 * Mail p@gmail.com
 */
public class HalfTaskThread extends Thread{

    private HalfSynTask task;

    public HalfTaskThread(HalfSynTask task){
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
