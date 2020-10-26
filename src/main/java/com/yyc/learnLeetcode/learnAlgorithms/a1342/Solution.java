package com.yyc.learnLeetcode.learnAlgorithms.a1342;

/**
 * Number of Steps to Reduce a Number to Zero
 *
 * @author yuechao
 */
public class Solution {
    public int numberOfSteps(int num) {
        int result = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            result++;
        }
        return result;
    }
}
