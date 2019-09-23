package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.SonSynTread;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/1/3.
 * Mail p@gmail.com
 */
public class SonSynTreadTest extends TestCase {
    public void testRun() throws Exception {
        SonSynTread thread = new SonSynTread();
        thread.start();

        Thread.sleep(1000 * 10);
    }
}