package com.yyc.learnleetcode.learnalgorithms.a1486;

/**
 * XOR Operation in an Array
 *
 * @author yuechao
 */
public class Solution {
    public int xorOperation(int n, int start) {
        var nums = new int[n];
        for (var i = 0; i < n; i++) {
            nums[i] = start + 2*i;
        }
        int result = nums[0];
        for (var i = 1; i < n; i++) {
            result = nums[i] ^ result;
        }
        return result;
    }
}
