package com.yyc.learnleetcode.learnalgorithms.a1304;

/**
 * @author yuechao
 */
public class Solution {
    public int[] sumZero(int n) {
        var result = new int[n];
        var sum = 0;
        for (var i = 0; i < n - 1; i++) {
            result[i] = i + 1;
            sum+=result[i];
        }
        result[n - 1] = -sum;
        return result;
    }
}
