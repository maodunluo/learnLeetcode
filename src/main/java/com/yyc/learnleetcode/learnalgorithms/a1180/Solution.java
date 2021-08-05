package com.yyc.learnleetcode.learnalgorithms.a1180;

/**
 * @author yuechao
 */
public class Solution {
    public int countLetters(String input) {
        var result = 0;
        char[] arr = input.toCharArray();
        var flag = 0;
        var continuousCount = 0;
        for (var i = 0; i < input.length(); i++) {
            if (arr[i] == arr[flag]) {
                continuousCount++;
            } else{
                flag = i;
                continuousCount = 1;
            }
            result+=continuousCount;
        }
        return result;
    }
}
