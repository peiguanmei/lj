package com.p.c.threadtutorial.char02;

/**
 * Created by p on 17/1/3.

 */
public class MyOneListService {


    public MyOneList addServiceMethod(MyOneList list,String data){
        try{
            synchronized (list){
                if (list.getSize() < 1){
                    Thread.sleep(1000 * 2);
                    list.add(data);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return list;
    }
}
