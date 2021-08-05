package com.yyc.learnleetcode.learnalgorithms.a1672;

/**
 * @author yuechao
 */
public class Solution {
    public int maximumWealth(int[][] accounts) {
        var result = 0;
        for (int[] account : accounts) {
            var sum = 0;
            for (int acc : account) {
                sum += acc;
            }
            if (sum > result) {
                result = sum;
            }
        }
        return result;
    }
}
