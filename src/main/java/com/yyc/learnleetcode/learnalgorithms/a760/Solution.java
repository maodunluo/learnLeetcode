package com.yyc.learnleetcode.learnalgorithms.a760;

/**
 * @author yuechao
 */
public class Solution {

    public int[] anagramMappings(int[] arrA, int[] arrB) {
        var result = new int[arrA.length];
        for (var i = 0; i < arrA.length; i++) {
            for (var j = 0; j < arrB.length; j++) {
                if (arrA[i] == arrB[j]) {
                    result[i] = j;
                    break;
                }
            }
        }
        return result;
    }
}
