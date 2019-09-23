package com.p.c.threadtutorial.char02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by p on 17/1/5.

 */
public class ExceptionService {

    synchronized public void getFile(){
        System.out.println("begin   " + System.currentTimeMillis() + "  " + Thread.currentThread().getName());
        File file = new File("111");
        try {
            Thread.sleep(1000 * 1);
            System.out.println(5 / 0);
            InputStream in = new FileInputStream(file);
            System.out.println("end" + System.currentTimeMillis() + "  " + Thread.currentThread().getName());

        } catch (FileNotFoundException | InterruptedException e) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            System.out.println("end Catch" + System.currentTimeMillis() + "  " + Thread.currentThread().getName());
        }
    }
}
