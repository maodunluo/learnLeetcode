package com.yyc.learnleetcode.learnalgorithms.a832;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author yuechao
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        for (var i = 0; i < arr.length; i++) {
            Deque<Integer> stack = new ArrayDeque<>();
            for (var j = 0; j < arr[i].length; j++) {
                stack.push(arr[i][j]);
            }
            for (var j = 0; j < arr[i].length; j++) {
                arr[i][j] =stack.pop();
                arr[i][j] ^= 1;
            }
        }
        return arr;
    }
}
