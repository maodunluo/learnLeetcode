package com.yyc.learnleetcode.learnalgorithms.a832;

import java.util.Stack;

/**
 * @author yuechao
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            //用stack性能特别差
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < A[i].length; j++) {
                stack.push(A[i][j]);
            }
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] =stack.pop();
                A[i][j] ^= 1;
            }
        }
        return A;
    }
}
