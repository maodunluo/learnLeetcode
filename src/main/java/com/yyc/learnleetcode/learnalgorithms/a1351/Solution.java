package com.yyc.learnleetcode.learnalgorithms.a1351;

/**
 * @author yuechao
 */
public class Solution {
    public int countNegatives(int[][] grid) {
        var result = 0;
        for (int[] row : grid) {
            for (var i = 0; i < row.length; i++) {
                if (row[i] < 0) {
                    result += (row.length - i);
                    break;
                }
            }
        }
        return result;
    }
}
