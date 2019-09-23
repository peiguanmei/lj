package com.p.c.iotutorialtest;

import com.p.c.iotutorial.bytestreamio.FileInputStreamExample;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/2/23.
 * Mail p@gmail.com
 */
public class FileInputStreamExampleTest extends TestCase {

    public void testReadFromFile() throws Exception {
        new FileInputStreamExample().readFromFile();
    }

}