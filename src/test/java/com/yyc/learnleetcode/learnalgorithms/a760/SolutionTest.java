package com.yyc.learnleetcode.learnalgorithms.a760;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void anagramMappingsTest() {
        int[] A = new int[]{12, 28, 46, 32, 50};
        int[] B = new int[]{50, 12, 32, 46, 28};
        int[] expected = new int[]{1, 4, 3, 2, 0};
        assertArrayEquals(expected, new Solution().anagramMappings(A, B));
    }

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