package com.p.paperProgramme;

import com.p.antinotion.Test;
import sun.applet.Main;

/**
 * Created by p on 2017/3/29.
 */
public class Test2 {
    public static Test2 t1 = new Test2();
    public static Test2 t2 = new Test2();
    {
        System.out.println("1111");
    }
    static {
        System.out.println("static");
    }


    public static void main(String[] args) {
        Test2 t3 = new Test2();

    }
}
