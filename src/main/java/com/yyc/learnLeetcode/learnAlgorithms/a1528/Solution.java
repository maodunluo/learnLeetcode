package com.yyc.learnLeetcode.learnAlgorithms.a1528;

import java.util.Arrays;

/**
 * Shuffle String
 *
 * @author yuechao
 */
public class Solution {
    public String restoreString(String s, int[] indices) {
        //如何按照下标取出并生成一个新的string
        final char[] chars = s.toCharArray();
        char[] newChars = new char[indices.length];
        for (int i = 0; i < chars.length; i++) {
            newChars[indices[i]] = chars[i];

        }
        return String.valueOf(newChars);
    }
}
