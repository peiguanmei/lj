package com.p.c.iotutorialtest;

import com.p.c.iotutorial.bytestreamio.ByteArrayOutPutStreamExample;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/2/23.
 * Mail p@gmail.com
 */
public class ByteArrayOutPutStreamExampleTest extends TestCase {
    public void testWriteFromFile() throws Exception {
        new ByteArrayOutPutStreamExample().writeToBytes();
    }

}