package com.yyc.learnLeetcode.learnAlgorithms.a1119;

/**
 * @author yuechao
 */
public class Solution {
    private String removeVowels(String S) {
        StringBuilder result = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                result.append(c);
            }
        }
        return result.toString();
    }
}
