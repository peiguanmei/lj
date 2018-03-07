package com.p.io;

import org.junit.Test;

import java.io.File;

/**
 * Created by p on 2017/4/5.
 */
public class TestFile {
    @Test
    public void testProperties() {
        System.getProperties().list(System.out);
    }
    public static void main(String[] args) {
        String fileName = "D:" + File.separator + "project";
        System.out.println(fileName);
        File file = new File(fileName);
        if (file.exists() && file.isDirectory()) {
            System.out.println("file is a Directory");
            File[] files = file.listFiles();
            //for (File file1 : files) {
            //    System.out.println(file1);
            //}
            System.out.println(files[0].getName());
            System.out.println(files[0].getPath());
            System.out.println(files[0].getAbsolutePath());
            System.out.println(files[0].getParentFile());
            System.out.println(files[0].lastModified());
        }

    }
}
