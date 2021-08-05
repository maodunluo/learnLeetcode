package com.yyc.learnleetcode.learnalgorithms.a1528;

/**
 * Shuffle String
 *
 * @author yuechao
 */
public class Solution {
    public String restoreString(String s, int[] indices) {
        //如何按照下标取出并生成一个新的string
        final char[] chars = s.toCharArray();
        var newChars = new char[indices.length];
        for (var i = 0; i < chars.length; i++) {
            newChars[indices[i]] = chars[i];

        }
        return String.valueOf(newChars);
    }
}
