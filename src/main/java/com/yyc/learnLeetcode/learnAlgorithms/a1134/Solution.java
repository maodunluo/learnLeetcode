package com.yyc.learnLeetcode.learnAlgorithms.a1134;

/**
 * @author yuechao
 */
public class Solution {
    public boolean isArmstrong(int N) {
        int count = getCount(N);
        return getSum(N, count);
    }

    private boolean getSum(int N, int count) {
        double sum = 0;
        int input = N;
        for (int i = 0; i <= count; i++) {
            sum += Math.pow(input % 10, count);
            input /= 10;
        }
        return sum == N;
    }

    private int getCount(int N) {
        int count = 0;
        while (N != 0) {
            N /= 10;
            count++;
        }
        return count;
    }
}
