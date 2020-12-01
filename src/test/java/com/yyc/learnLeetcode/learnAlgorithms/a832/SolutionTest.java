package com.yyc.learnLeetcode.learnAlgorithms.a832;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    int[][] arrays = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
    int[][] result = new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};

    @Test
    void flipAndInvertImage() {
        assertArrayEquals(result, new Solution().flipAndInvertImage(arrays));
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < A[i].length; j++) {
                stack.push(A[i][j]);
            }
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = stack.pop();
                A[i][j] ^= 1;
            }
        }
        return A;
    }
}