package com.yyc.learnleetcode.learnalgorithms.a1748;

import java.util.HashMap;
import java.util.Map;

/**
 * 1748. Sum of Unique Elements
 *
 * @author yuechao
 */
public class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> hashmap = new HashMap<>(nums.length);
        for (int num : nums) {
            Integer orDefault = hashmap.getOrDefault(num, 0);
            hashmap.put(num, orDefault + 1);
        }
        var result = 0;
        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() == 1) {
                result += entry.getKey();
            }
        }
        return result;
    }
}
