package com.yyc.learnleetcode.learnalgorithms.a1720;

/**
 * 1720. Decode XORed Array
 *
 * @author yuechao
 */
public class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] ^ encoded[i - 1];
        }
        return result;
    }
}
