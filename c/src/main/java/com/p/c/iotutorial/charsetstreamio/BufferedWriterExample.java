package com.p.c.iotutorial.charsetstreamio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by shiqifeng on 2017/2/23.
 * Mail p@gmail.com
 */
public class BufferedWriterExample {


    public void writeToFile() throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:" + File.separator + "write_file.txt"))) {
            for (int i = 0 ;i < 100000;i++) {
                String str = "阿萨建设u无IDask链接";
                bw.write(str);
            }
        }
    }
}
