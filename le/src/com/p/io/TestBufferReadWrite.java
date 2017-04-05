package com.p.io;

import org.junit.Test;

import javax.swing.*;
import java.io.*;

/**
 * Created by p on 2017/4/5.
 */
public class TestBufferReadWrite {
    @Test
    public void testBufferRW() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\project\\hello4.txt"));
            BufferedReader br = new BufferedReader(new FileReader("d:\\project\\hello4.txt"));
            String str = null;
            for (int i =0;i<100;i++) {
                str = String.valueOf(Math.random());
                bw.write(str);
                bw.newLine();
            }
            bw.flush();
            while ((str=br.readLine()) != null) {
                System.out.println(str);
            }
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
