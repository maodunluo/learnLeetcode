package com.yyc.learnleetcode.learnalgorithms.a1403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1403. Minimum Subsequence in Non-Increasing Order
 *
 * @author yuechao
 */
public class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        List<Integer> result = new ArrayList<>();
        if (nums.length == 1) {
            result.add(nums[0]);
            return result;
        }
        if (nums.length == 2 && nums[0] == nums[1]) {
            result.add(nums[0]);
            result.add(nums[1]);
            return result;
        }
        int partSum = 0;
        for (int i = nums.length - 1 ; i > 0 ; i--) {
            partSum += nums[i];
            sum -= nums[i];
            result.add(nums[i]);
            if (partSum > sum) {
                break;
            }
        }
        return result;
    }
}
