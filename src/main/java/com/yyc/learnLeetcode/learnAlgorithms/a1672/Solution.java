package com.yyc.learnLeetcode.learnAlgorithms.a1672;

/**
 * @author yuechao
 */
public class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int[] account : accounts) {
            int sum = 0;
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
