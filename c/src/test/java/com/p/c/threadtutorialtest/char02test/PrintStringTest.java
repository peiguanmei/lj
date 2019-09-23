package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.PrintString;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/1/4.
 * Mail p@gmail.com
 */
public class PrintStringTest extends TestCase {
    public void testPrintStringMethod() throws Exception {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("我要停止他！stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }

}