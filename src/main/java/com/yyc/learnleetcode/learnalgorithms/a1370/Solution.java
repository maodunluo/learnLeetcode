package com.yyc.learnleetcode.learnalgorithms.a1370;

/**
 * @author yuechao
 */
public class Solution {
    private static final int NUMBER_OF_CHAR = 26;

    public String sortString(String s) {
        //统计每个字符出现的次数
        var count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        var result = new StringBuilder();
        while (result.length() < s.length()) {
            for (var i = 0; i < NUMBER_OF_CHAR; i++) {
                if (count[i]-- > 0) {
                    result.append((char) (i + 'a'));
                }
            }
            for (int j = NUMBER_OF_CHAR - 1; j >= 0; j--) {
                if (count[j]-- > 0) {
                    result.append((char) (j + 'a'));
                }
            }
        }
        return result.toString();
    }
}
