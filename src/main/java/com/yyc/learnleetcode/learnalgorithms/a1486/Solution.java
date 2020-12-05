package com.yyc.learnleetcode.learnalgorithms.a1486;

/**
 * XOR Operation in an Array
 *
 * @author yuechao
 */
public class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2*i;
        }
        int result = nums[0];
        for (int i = 1; i < n; i++) {
            result = nums[i] ^ result;
        }
        return result;
    }
}
