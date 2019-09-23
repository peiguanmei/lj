package com.p.c.iotutorialtest;

import com.p.c.iotutorial.charsetstreamio.OutputStreamWriterExample;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/2/23.
 * Mail p@gmail.com
 */
public class OutputStreamWriterExampleTest extends TestCase {

    public void testWriteToFile() throws Exception {
        new OutputStreamWriterExample().writeToFile();
    }

}