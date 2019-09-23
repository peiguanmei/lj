package com.p.c.iotutorialtest;

import com.p.c.iotutorial.bytestreamio.BufferdInputStreamExample;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/2/23.
 * Mail p@gmail.com
 */
public class BufferdInputStreamExampleTest extends TestCase {
    public void testReadFromFile() throws Exception {
        new BufferdInputStreamExample().readFromFile();
    }

}