package com.yyc.learnleetcode.learnalgorithms.a1662;

/**
 * @author yuechao
 */
public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    public boolean arrayStringsAreEqualByStringBuilder(String[] word1, String[] word2) {
        return convertArrayToString(word1).equals(convertArrayToString(word2));
    }

    String convertArrayToString(String[] arr) {
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }
        return result.toString();
    }
}
