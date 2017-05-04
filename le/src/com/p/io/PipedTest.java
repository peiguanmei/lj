package com.p.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by p on 2017/4/25.
 */
public class PipedTest {
    public static void main(String[] args) throws IOException {
        PipedSendTest send = new PipedSendTest();
        PipedReceiverTest receive = new PipedReceiverTest();
        Thread sendThread = new Thread(send);
        Thread receiveThread = new Thread(receive);
        PipedOutputStream pos = send.getPos();
        PipedInputStream pis = receive.getPis();
        pos.connect(pis);
        sendThread.start();
        receiveThread.start();
    }
}
