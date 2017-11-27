package com.p.arrays.easy.ArrayPartition1;

import org.junit.Test;

import java.util.Arrays;

/**
 * title:
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn)
 * which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * Example
          Input: [1,4,3,2]
          Output: 4
          Explanation: n is 2, and the maximum sum of pairs is 4.
 * note:
          n is a positive integer, which is in the range of [1, 10000].
          All the integers in the array will be in the range of [-10000, 10000].
 *
 * 大意:
 * 给定一个长度为2n(偶数)的数组，分成n个小组，返回每组中较小值的和sum，使sum尽量大
 *
 * 解题思路:
 * 先把数组排序，将相邻的2个数分为一组，每组最小数都在左边，相加求和即可
 */
public class Solution561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }

    @Test
    public void testCase() {
        int[] nums = {1, 3, 4, 2, 9,15};
        System.out.println(arrayPairSum(nums));
    }
}
