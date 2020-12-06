package com.yyc.learnleetcode.learnalgorithms.a1374;

/**
 * @author yuechao
 */
public class Solution {
    private static final int MOD = 2;

    public String generateTheString(int n) {
        StringBuilder builder = new StringBuilder();
        int count = n;
        for (int i = 0; i < count; i++) {
            builder.append("a");
        }
        if (count % MOD == 0) {
            builder.setCharAt(count - 1, 'b');
        }
        return builder.toString();
    }
}
