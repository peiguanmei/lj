package com.p.io;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by p on 2017/4/5.
 */
public class TestBufferStream {
    @Test
    public void testBufferInput() {
        try {
            int b = 0;
            FileInputStream in = new FileInputStream("d:\\project\\hello.txt");
            BufferedInputStream bis = new BufferedInputStream(in);
            while ((b=bis.read()) != -1) {
            System.out.println(b+"---"+(char)b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
