package com.yyc.learnleetcode.learnalgorithms.a760;

/**
 * @author yuechao
 */
public class Solution {

    public int[] anagramMappings(int[] arrA, int[] arrB) {
        int[] result = new int[arrA.length];
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] == arrB[j]) {
                    result[i] = j;
                    break;
                }
            }
        }
        return result;
    }
}
