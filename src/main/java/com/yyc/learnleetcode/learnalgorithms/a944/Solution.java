package com.yyc.learnleetcode.learnalgorithms.a944;

/**
 * 944. Delete Columns to Make Sorted
 *
 * @author yuechao
 */
public class Solution {
    public int minDeletionSize(String[] str) {
        var result = 0;
        for (var i = 0; i < str[0].length(); i++) {
            for (var j = 1; j < str.length; j++) {
                if (str[j].charAt(i) < str[j - 1].charAt(i)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
