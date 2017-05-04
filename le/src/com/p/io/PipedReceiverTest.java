package com.p.io;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by p on 2017/4/25.
 */
public class PipedReceiverTest implements Runnable{
    private PipedInputStream pis = new PipedInputStream();

    public PipedInputStream getPis() {
        return pis;
    }

    @Override
    public void run() {
        String st = null;
        byte[] b = new byte[1024];
        try {
            int i = pis.read(b);
            while (i != -1) {
                st = new String(b, 0, i);
                System.out.println("receiver message"+st);
            }
            pis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
