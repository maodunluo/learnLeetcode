package com.yyc.learnleetcode.learnalgorithms.a461;

/**
 * @author yuechao
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        var result = 0;
        while (z != 0) {
            if (z % 2 != 0) {
                result++;
            }
            z /= 2;
        }
        return result;
    }
}
