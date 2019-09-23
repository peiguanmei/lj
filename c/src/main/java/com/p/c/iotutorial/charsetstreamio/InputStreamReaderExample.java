package com.p.c.iotutorial.charsetstreamio;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by shiqifeng on 2017/2/23.
 * Mail p@gmail.com
 */
public class InputStreamReaderExample {

    public void readFromFile() throws Exception{
        try (Reader reader = new InputStreamReader(new FileInputStream("D:" + File.separator + "read_file.txt"))) {
            char[] chars = new char[1024];
            while (reader.read(chars) != -1){
                System.out.print(new String(chars));
            }
        }
    }
}
