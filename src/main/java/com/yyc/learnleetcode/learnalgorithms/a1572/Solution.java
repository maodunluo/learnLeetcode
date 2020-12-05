package com.yyc.learnleetcode.learnalgorithms.a1572;

/**
 * Matrix Diagonal Sum
 *
 * @author yuechao
 */
public class Solution {
    public int diagonalSum(int[][] mat) {
        int result = 0;
        if (mat.length % 2 != 0) {
            result -= mat[(mat.length - 1)/2][(mat.length - 1)/2];
        }
        for (int i = 0; i < mat.length; i++) {
            result+= mat[i][mat.length-i - 1] + mat[i][i];
        }
        return result;
    }
}
