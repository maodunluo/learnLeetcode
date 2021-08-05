package com.yyc.learnleetcode.learnalgorithms.a1299;

/**
 * @author yuechao
 */
public class Solution {
    public int[] replaceElements(int[] arr) {
        var result = new int[arr.length];
        var maxIndex = 0;
        while (maxIndex != arr.length - 1) {
            int startIndex = maxIndex;
            var max = 0;
            for (int i = maxIndex + 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    maxIndex = i;
                }
            }
            for (int i = startIndex; i < maxIndex; i++) {
                result[i] = max;
            }
        }
        result[arr.length - 1] = -1;
        return result;
    }
}
