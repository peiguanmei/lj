package com.p.c.iotutorialtest;

import com.p.c.iotutorial.bytestreamio.ByteArrayInputStreamExample;
import junit.framework.TestCase;

/**
 * Created by p on 17/2/21.

 */
public class ByteArrayInputStreamExampleTest extends TestCase {
    public void testReadFromArray() throws Exception {
        byte[] bytes = new byte[]{0x1,0x2,0x3,0x4,0x5,0x6,0x7};
        ByteArrayInputStreamExample example = new ByteArrayInputStreamExample();
        System.out.println(example.readFromArray(bytes));
    }


    public void testReadMarkAndReset() throws Exception {
        byte[] bytes = new byte[]{0x1,0x2,0x3,0x4,0x5,0x6,0x7};
        ByteArrayInputStreamExample example = new ByteArrayInputStreamExample();
        example.readMarkAndReset(bytes,2);
        System.out.println("++++++++++++++++++++");
    }

}