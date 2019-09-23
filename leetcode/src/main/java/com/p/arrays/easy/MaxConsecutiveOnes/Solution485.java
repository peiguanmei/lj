package com.p.arrays.easy.MaxConsecutiveOnes;

import org.junit.Test;

/**
 * Max Consecutive Ones
 *
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * 题意：
 *   给定一个数组，求出连续1的最大数。
 *
 * Example
 *   Input: [1,1,0,1,1,1]
 *   Output: 3
 *   Explanation: The first two digits or the last three digits are consecutive 1s.
 *                The maximum number of consecutive 1s is 3.
 *
 * Note
 *   The input array will only contain 0 and 1.
 *   The length of input array is a positive integer and will not exceed 10,000
 *
 * 思路:
 * 1.result变量保存当前最大连续数，每次遍历都与之进行比较；
 * 2.count变量，记录当前连续1的个数；
 * 3.当遇到非1元素时，对比result与count，将较大者赋给result;
 * 4.返回result。
 */
public class Solution485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        //下面for的简化
        for (int num : nums) {
            result = Math.max(result, count = num == 0 ? 0 : count + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                result = Math.max(result, count);
            }else {
                count = 0;
            }
        }
        return result;
    }


    @Test
    public void testCase() {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
