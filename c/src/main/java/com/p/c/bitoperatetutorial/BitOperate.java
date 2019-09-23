package com.p.c.bitoperatetutorial;

/**
 * Created by p on 2017/6/27.

 */
public class BitOperate {


    public String getRightestOne(int n){
        int res = n & (~n + 1);
        return Integer.toBinaryString(res);
    }
}
