package com.yyc.learnleetcode.learnalgorithms.a1180;

/**
 * @author yuechao
 */
public class Solution {
    public int countLetters(String input) {
        int result = 0;
        char[] arr = input.toCharArray();
        int flag = 0;
        int continuousCount = 0;
        for (int i = 0; i < input.length(); i++) {
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
