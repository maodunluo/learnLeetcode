package com.yyc.learnleetcode.learnalgorithms.a1534;

/**
 * Count Good Triplets
 *
 * @author yuechao
 */
public class Solution {
    private static final int TWO = 2;
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        var result = 0;
        for (var i = 0; i < arr.length - TWO; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
