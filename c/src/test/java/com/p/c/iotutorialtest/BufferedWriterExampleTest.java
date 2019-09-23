package com.p.c.iotutorialtest;

import com.p.c.iotutorial.charsetstreamio.BufferedWriterExample;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/2/23.
 * Mail p@gmail.com
 */
public class BufferedWriterExampleTest extends TestCase {
    public void testWriteToFile() throws Exception {

        new BufferedWriterExample().writeToFile();

    }

}