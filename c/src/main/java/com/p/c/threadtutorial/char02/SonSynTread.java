package com.p.c.threadtutorial.char02;

/**
 * Created by shiqifeng on 2017/1/3.
 * Mail p@gmail.com
 */
public class SonSynTread extends Thread{
    @Override
    public void run() {
        super.run();
        SonSynService son = new SonSynService();
        son.operateISubMethod();
    }
}
