package com.yyc.learnleetcode.learnalgorithms.a1374;

/**
 * @author yuechao
 */
public class Solution {
    private static final int MOD = 2;

    public String generateTheString(int n) {
        var builder = new StringBuilder();
        builder.append("a".repeat(Math.max(0, n)));
        if (n % MOD == 0) {
            builder.setCharAt(n - 1, 'b');
        }
        return builder.toString();
    }
}
