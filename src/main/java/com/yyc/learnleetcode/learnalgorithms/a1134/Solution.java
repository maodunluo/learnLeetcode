package com.yyc.learnleetcode.learnalgorithms.a1134;

/**
 * @author yuechao
 */
public class Solution {
    public boolean isArmstrong(int n) {
        int count = getCount(n);
        return getSum(n, count);
    }

    private boolean getSum(int n, int count) {
        double sum = 0;
        int input = n;
        for (int i = 0; i <= count; i++) {
            sum += Math.pow(input % 10, count);
            input /= 10;
        }
        return sum == n;
    }

    private int getCount(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
