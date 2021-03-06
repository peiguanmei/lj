package com.p.c.iotutorial.bytestreamio;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by shiqifeng on 2017/2/23.
 * Mail p@gmail.com
 */
public class FileInputStreamExample {

    public void readFromFile() throws Exception{
        String s = File.separator;
        try(FileInputStream fis = new FileInputStream("D:" + s + "read_file.txt")){
            byte[] bytes = new byte[1024];
            while (fis.read(bytes) != -1) {
                String str = new String(bytes);
                System.out.println(str);
            }
        }
    }
}
