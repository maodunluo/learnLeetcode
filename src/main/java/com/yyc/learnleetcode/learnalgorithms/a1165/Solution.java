package com.yyc.learnleetcode.learnalgorithms.a1165;

/**
 * @author yuechao
 */
public class Solution {
    public int calculateTime(String keyboard, String word) {
        var keyboardArray = new int[26];
        for (var i = 0; i < keyboardArray.length; i++) {
            keyboardArray[keyboard.charAt(i) - 'a'] = i;
        }
        var result = 0;
        var last = 0;
        for (char c : word.toCharArray()) {
            result += Math.abs(keyboardArray[c - 'a'] - last);
            last = keyboardArray[c - 'a'];
        }
        return result;
    }
}
