package com.p.io;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by p on 2017/4/25.
 */
public class PipedSendTest implements Runnable{
    private PipedOutputStream pos = new PipedOutputStream();

    public PipedOutputStream getPos() {
        return pos;
    }

    @Override
    public void run() {
        String str = "Recevier, hello !";
        try {
            pos.write(str.getBytes());
            pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
