package com.yyc.learnLeetcode.learnAlgorithms.a1588;

/**
 * @author yuechao
 */
public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += ((arr.length - i) * (i + 1) + 1) / 2 * arr[i];
        }
        return result;
    }
}
