package com.yyc.learnLeetcode.learnAlgorithms.a1480;

import java.util.ArrayList;

/**
 * Running Sum of 1d Array
 *
 * @author yuechao
 */
public class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
