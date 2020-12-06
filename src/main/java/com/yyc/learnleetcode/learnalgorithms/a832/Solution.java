package com.yyc.learnleetcode.learnalgorithms.a832;

import java.util.Stack;

/**
 * @author yuechao
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            //用stack性能特别差
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < arr[i].length; j++) {
                stack.push(arr[i][j]);
            }
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] =stack.pop();
                arr[i][j] ^= 1;
            }
        }
        return arr;
    }
}
