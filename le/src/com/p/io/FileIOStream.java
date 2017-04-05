package com.p.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by p on 2017/4/5.
 */
public class FileIOStream {
    @Test
    public void FileInStream() {
        try {
            int num = 0;
            int b = 0;
            FileInputStream in = new FileInputStream("d:\\project\\hello.txt");
            while ((b = in.read()) != -1) {
                num++;
                System.out.println("------"+b+"---"+(char)b);
            }
            in.close();
            System.out.println("+++++++++++"+num);
        } catch (FileNotFoundException e) {
            System.out.println("cant find file");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("end");
        }
    }

    @Test
    public void FileIOStreamTest() {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("d:\\project\\hello.txt");
            out = new FileOutputStream("d:\\project\\hello2.txt");
            while ((b=in.read()) != -1) {
                out.write(b);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("cant find file");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("file have write finished");
    }
}
