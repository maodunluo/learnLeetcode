package com.yyc.learnLeetcode.learnAlgorithms.a1295;

/**
 * Find Numbers with Even Number of Digits
 *
 * @author yuechao
 */
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            int count = 1;
            while (num / 10 != 0) {
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
