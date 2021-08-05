package com.yyc.learnleetcode.learnalgorithms.a1768;

/**
 * 1768. Merge Strings Alternately
 *
 * @author yuechao
 */
public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int minLength = Math.min(word1.length(), word2.length());
        var result = new StringBuilder();
        for (var i = 0; i < minLength; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        result.append(word1.substring(minLength));
        result.append(word2.substring(minLength));
        return result.toString();
    }
}
