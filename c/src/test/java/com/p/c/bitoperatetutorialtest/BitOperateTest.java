package com.p.c.bitoperatetutorialtest;

import com.p.c.bitoperatetutorial.BitOperate;
import junit.framework.TestCase;

/**
 * Created by p on 2017/6/27.

 */
public class BitOperateTest extends TestCase {

    BitOperate bitOperate;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        bitOperate = new BitOperate();
    }

    public void testGetRightestOne() throws Exception {
        assertEquals(bitOperate.getRightestOne(Integer.valueOf("100100",2)),"100");
    }

}