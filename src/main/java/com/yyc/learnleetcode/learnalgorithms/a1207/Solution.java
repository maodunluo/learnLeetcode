package com.yyc.learnleetcode.learnalgorithms.a1207;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 1207. Unique Number of Occurrences
 *
 * @author yuechao
 */
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(arr.length);
        for (int key : arr) {
            Integer value = map.get(key);
            if (!Objects.isNull(value)) {
                map.put(key, ++value);
            } else {
                map.put(key, 1);
            }
        }
        long count = map.values().stream().distinct().count();
        return count == map.size();
    }
}
