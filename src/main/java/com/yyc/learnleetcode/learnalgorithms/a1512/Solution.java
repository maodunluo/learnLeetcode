package com.yyc.learnleetcode.learnalgorithms.a1512;

/**
 * Number of Good Pairs
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 * Return the number of good pairs.
 *
 * @author yuechao
 */
public class Solution {
    public int numIdenticalPairs(int[] nums) {
        var result = 0;
        for (var i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
