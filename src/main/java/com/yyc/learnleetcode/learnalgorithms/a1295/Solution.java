package com.yyc.learnleetcode.learnalgorithms.a1295;

/**
 * Find Numbers with Even Number of Digits
 *
 * @author yuechao
 */
class Solution {
    private static final int DIVISOR = 10;

    public int findNumbers(int[] nums) {
        var result = 0;
        for (int num : nums) {
            var count = 1;
            while (num / DIVISOR != 0) {
                count++;
                num /= 10;
            }
            if (count % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
