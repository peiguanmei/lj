package com.p.c.iotutorialtest;

import com.p.c.iotutorial.bytestreamio.BufferdOutputStreamExample;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/2/23.
 * Mail p@gmail.com
 */
public class BufferdOutputStreamExampleTest extends TestCase {
    public void testWriteToFile() throws Exception {
        new BufferdOutputStreamExample().writeToFile();

    }

}
