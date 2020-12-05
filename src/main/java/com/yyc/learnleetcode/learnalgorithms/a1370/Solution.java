package com.yyc.learnleetcode.learnalgorithms.a1370;

/**
 * @author yuechao
 */
public class Solution {
    public String sortString(String s) {
        //统计每个字符出现的次数
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder result = new StringBuilder();
        while (result.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (count[i]-- > 0) {
                    result.append((char) (i + 'a'));
                }
            }
            for (int j = 25; j >= 0; j--) {
                if (count[j]-- > 0) {
                    result.append((char) (j + 'a'));
                }
            }
        }
        return result.toString();
    }
}
