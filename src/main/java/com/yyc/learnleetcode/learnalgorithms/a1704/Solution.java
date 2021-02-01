package com.yyc.learnleetcode.learnalgorithms.a1704;

/**
 * @author yuechao
 */
public class Solution {
    public boolean halvesAreAlike(String s) {
        char[] chars = s.toCharArray();
        int beforeHalfCount = 0;
        int afterHalfCount = 0;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    if (i < chars.length / 2) {
                        beforeHalfCount++;
                    } else {
                        afterHalfCount++;
                    }
                    break;
                default:
            }
        }
        return beforeHalfCount == afterHalfCount;
    }
}
