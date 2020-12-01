package com.yyc.learnLeetcode.learnAlgorithms.a1165;

/**
 * @author yuechao
 */
public class Solution {
    public int calculateTime(String keyboard, String word) {
        int[] keyboardArray = new int[26];
        for (int i = 0; i < keyboardArray.length; i++) {
            keyboardArray[keyboard.charAt(i) - 'a'] = i;
        }
        int result = 0;
        int last = 0;
        for (char c : word.toCharArray()) {
            result += Math.abs(keyboardArray[c - 'a'] - last);
            last = keyboardArray[c - 'a'];
        }
        return result;
    }
}
