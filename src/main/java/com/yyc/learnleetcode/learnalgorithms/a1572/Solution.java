package com.yyc.learnleetcode.learnalgorithms.a1572;

/**
 * Matrix Diagonal Sum
 *
 * @author yuechao
 */
public class Solution {
    private static final int MOD = 2;

    public int diagonalSum(int[][] mat) {
        var result = 0;
        if (mat.length % MOD != 0) {
            result -= mat[(mat.length - 1) / 2][(mat.length - 1) / 2];
        }
        for (var i = 0; i < mat.length; i++) {
            result += mat[i][mat.length - i - 1] + mat[i][i];
        }
        return result;
    }
}
