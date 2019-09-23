package com.p.c.threadtutorial.char02;

/**
 * Created by p on 17/1/3.

 */
public class ListThread extends Thread{

    private MyOneList list;
    private String str;

    public ListThread(MyOneList list,String str){
        this.list = list;
        this.str = str;
    }

    @Override
    public void run() {
        super.run();
        MyOneListService service = new MyOneListService();
        service.addServiceMethod(list,str);
    }
}
