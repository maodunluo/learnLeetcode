package com.yyc.learnleetcode.learnalgorithms.a1119;

/**
 * @author yuechao
 */
public class Solution {
    public String removeVowels(String input) {
        var result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (vowel(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    private boolean vowel(char c) {
        return (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u');
    }
}
