package com.yyc.learnleetcode.learnalgorithms.a852;

/**
 * 852. Peak Index in a Mountain Array
 *
 * @author yuechao
 */
public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = arr[0];
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result++;
            }
            if (arr[i] <arr[i - 1]) {
                break;
            }
        }
        return result;
    }
}
