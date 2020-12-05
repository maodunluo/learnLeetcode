package com.yyc.learnleetcode.learnalgorithms.a1085;

/**
 * @author yuechao
 */
public class Solution {
    private static final int MOD = 2;
    public int sumOfDigits(int[] input) {
        int result = 0;
        int minimal = input[0];
        for (int element : input) {
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
