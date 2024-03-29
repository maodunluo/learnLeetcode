package com.yyc.learnleetcode.learnalgorithms.a1480;

/**
 * Running Sum of 1d Array
 *
 * @author yuechao
 */
public class Solution {
    public int[] runningSum(int[] nums) {
        for (var i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
