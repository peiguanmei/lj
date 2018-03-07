package com.p.io;

import org.junit.Test;

import java.io.*;

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

    @Test
    public void FileWriteTest() throws IOException {
        File file = new File("D:/project/Write");
        Writer fw = new FileWriter(file);
        String str = "hello,world!!";
        fw.write(str);
        //fw.close();

        Reader in = new FileReader(file);
        char[] b = new char[1024];
        int i = in.read(b);
        in.close();
        if (i == -1) {
            System.out.println("write file no date");
        }else {
            System.out.println(b);
        }
    }
}

