package com.p.c.threadtutorial.char02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by p on 17/1/3.

 */
public class MyOneList {

    private List list = new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    }

    synchronized public int getSize(){
        return list.size();
    }
}
