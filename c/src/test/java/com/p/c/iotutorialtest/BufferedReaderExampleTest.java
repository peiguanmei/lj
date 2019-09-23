package com.p.c.iotutorialtest;

import com.p.c.iotutorial.charsetstreamio.BufferedReaderExample;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/2/23.
 * Mail p@gmail.com
 */
public class BufferedReaderExampleTest extends TestCase {
    public void testReadFromFile() throws Exception {
        new BufferedReaderExample().readFromFile();
    }

}