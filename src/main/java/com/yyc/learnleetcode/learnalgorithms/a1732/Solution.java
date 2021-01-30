package com.yyc.learnleetcode.learnalgorithms.a1732;

/**
 * 1732. Find the Highest Altitude
 *
 * @author yuechao
 */
public class Solution {
    public int largestAltitude(int[] gain) {
        int result = 0;
        int sum = 0;
        for (int value : gain) {
            sum += value;
            if (sum > result) {
                result = sum;
            }
        }
        return Math.max(result, 0);
    }
}
