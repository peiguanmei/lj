package com.p.c.threadtutorial.char05.one2one.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by p on 17/2/1.

 */
public class MyQueue {

    private List lists = new ArrayList();

    synchronized public void push(Object element){
        try {
            if (lists.size() == 1) {
                this.wait();
            }
            lists.add(element);
            this.notify();
            System.out.println("push = " + lists.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    synchronized public Object pop(){
        Object value = new Object();
        try {
            if (lists.size() == 0) {
                System.out.println("pop操作中的" + Thread.currentThread().getName() + "呈现wait状态");
                this.wait();
            }

            value = "" + lists.get(0);
            lists.remove(0);
            this.notify();
            System.out.println("pop=" + lists.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return value;
    }
}
