package com.yyc.learnleetcode.learnalgorithms.a1588;

/**
 * @author yuechao
 */
public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        var result = 0;
        for (var i = 0; i < arr.length; i++) {
            result += ((arr.length - i) * (i + 1) + 1) / 2 * arr[i];
        }
        return result;
    }
}
