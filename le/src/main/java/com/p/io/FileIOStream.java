package com.p.io;



import jdk.internal.util.xml.impl.Input;
import org.junit.Test;

import java.io.*;

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

    @Test
    public void FileOutputStreamTest() throws IOException {
        //File file = new File("D:/project/stream.txt");
        //OutputStream ot = new FileOutputStream(file);
        //byte[] b = "hello world!".getBytes();
        //ot.write(b);
        //ot.close();
        OutputStream ot = new FileOutputStream(new File("d:/project/stream.txt"));
        ot.write("hello,world!".getBytes());
        ot.close();
    }

    @Test
    public void FileInputStreamTest() throws IOException {
        File file = new File("d:/project/stream.txt");
        InputStream is = new FileInputStream(file);
        int i = 0;
        byte[] b = new byte[(int) file.length()];
        i = is.read(b);
        System.out.println(b);
        System.out.println(i);
        System.out.println(new String(b,0,i));
        is.close();
        //while (is.read() != -1) {
        //    System.out.println(is.read());
        //}
    }
}
