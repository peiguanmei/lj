package com.p.c.designpatterntutorial.singleton;

/**
 * Created by shiqifeng on 2017/3/14.
 * Mail p@gmail.com
 */
public class HungrySingleton {
    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){

    }

//    public static HungrySingleton getSingleton(){
//        return singleton;
//    }
}
