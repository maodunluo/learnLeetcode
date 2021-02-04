package com.yyc.learnleetcode.learnalgorithms.a1051;

import java.util.Arrays;

/**
 * 1051. Height Checker
 *
 * @author yuechao
 */
public class Solution {

    public int heightChecker(int[] heights) {
        int[] inputArray = Arrays.copyOf(heights, heights.length);
        //对传入数组按照从小到大排序，然后和原来的数组比较。
        Arrays.sort(heights);
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            if (inputArray[i] != heights[i]) {
                result++;
            }
        }
        return result;
    }
}
