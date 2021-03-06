package com.p.c.designpatterntutorial.singleton;

/**
 * Created by shiqifeng on 2017/3/14.
 * Mail p@gmail.com
 */
public class DCLSingleton {

    private static volatile DCLSingleton singleton;

    private DCLSingleton(){

    }

    public  static DCLSingleton getSingleton(){
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }



}
