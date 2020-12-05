package com.yyc.learnleetcode.learnalgorithms.a760;

/**
 * @author yuechao
 */
public class Solution {

    public int[] anagramMappings(int[] A, int[] B) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    result[i] = j;
                    break;
                }
            }
        }
        return result;
    }
}
