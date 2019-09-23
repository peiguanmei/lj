package com.p.c.threadtutorial.char03;

/**
 * Created by p on 17/1/15.

 */
public class CommonNotify {

    private Object object;
    public CommonNotify(Object object){
        this.object = object;
    }

    public void doNotify(){
        synchronized (object){
            System.out.println("准备通知");
            object.notifyAll();
            System.out.println("通知结束");
        }
    }
}
