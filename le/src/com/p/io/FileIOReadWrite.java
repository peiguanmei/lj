package com.p.io;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by p on 2017/4/5.
 */
public class FileIOReadWrite {

    @Test
    public void FileIORead() {
        int b = 0;
        FileReader fr = null;
        try {
            fr = new FileReader("d:\\project\\hello.txt");
            while ((b = fr.read()) != -1) {
                System.out.println("----" + b + "---" + (char) b);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void FileIOReadWrite() {
        int b = 0;
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("d:\\project\\hello.txt");
            fw = new FileWriter("d:\\project\\hello3.txt");
            while ((b = fr.read()) != -1) {
                fw.write(b);
            }
            fr.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

