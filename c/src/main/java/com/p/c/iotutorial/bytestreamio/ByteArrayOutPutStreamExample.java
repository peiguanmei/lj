package com.p.c.iotutorial.bytestreamio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by shiqifeng on 2017/2/23.
 * Mail p@gmail.com
 */
public class ByteArrayOutPutStreamExample {

    public void writeToBytes() throws Exception {
        try (InputStream is = new FileInputStream("D://read_file.txt")) {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            while (is.read(bytes) != -1) {
                output.write(bytes);
            }

            String data = output.toString("UTF-8");
            System.out.println(data);

        }
    }
}
