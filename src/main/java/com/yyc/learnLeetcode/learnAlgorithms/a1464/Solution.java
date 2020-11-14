package com.yyc.learnLeetcode.learnAlgorithms.a1464;

import java.util.Arrays;

/**
 * @author yuechao
 */
public class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return ((nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1));
    }
}
