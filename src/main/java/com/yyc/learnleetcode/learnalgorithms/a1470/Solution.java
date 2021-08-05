package com.yyc.learnleetcode.learnalgorithms.a1470;

/**
 * Shuffle the Array
 * It's wrong to put "i" in result's index.I should use nums to reasoning result.
 *
 * @author yuechao
 */
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        var result = new int[2 * n];
        for (var i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }
}
