package com.yyc.learnLeetcode.learnAlgorithms.a709;

/**
 * 注意边界条件To Lower Case
 *
 * @author yuechao
 */
public class Solution {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i  = 0; i < chars.length; i++) {
            if ((int) chars[i] < 97 && (int) chars[i] > 64) {
                chars[i] = (char) ((int)chars[i] + 32);
            }
        }
        return String.valueOf(chars);
    }
}
