package com.yyc.learnleetcode.learnalgorithms.a561;

import java.util.Arrays;

/**
 * @author yuechao
 */
public class Solution {
    private static final int TWO = 2;

    public int arrayPairSum(int[] nums) {
        int[] copyArr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyArr);
        int result = 0;
        for (int i = 0; i < copyArr.length; i += TWO) {
            result += copyArr[i];
        }
        return result;
    }
}
