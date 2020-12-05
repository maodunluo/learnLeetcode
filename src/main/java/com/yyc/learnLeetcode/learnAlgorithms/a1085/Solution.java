package com.yyc.learnLeetcode.learnAlgorithms.a1085;

/**
 * @author yuechao
 */
public class Solution {
    private static final int MOD = 2;
    public int sumOfDigits(int[] A) {
        int result = 0;
        int minimal = A[0];
        for (int element : A) {
            if (minimal > element) {
                minimal = element;
            }
        }
        int sum = getSum(minimal);
        if (sum % MOD == 0) {
            result = 1;
        }
        return result;
    }

    private int getSum(int minimal) {
        int sum = 0;
        while (minimal != 0) {
            sum += minimal % 10;
            minimal /= 10;
        }
        return sum;
    }
}
