package com.yyc.learnleetcode.learnalgorithms.a1460;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yuechao
 */
public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        //如果两个数组里有不同元素，肯定是false，其他情况全为true
        int[] ints = Arrays.stream(target).sorted().toArray();
        int[] ints1 = Arrays.stream(arr).sorted().toArray();
        for (var i = 0; i < ints.length; i++) {
            if (ints[i] != ints1[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean simpleCanBeEqual(int[] target, int[] arr) {
        int m = target.length;
        int n = arr.length;
        if (m!= n) {
            return false;
        }
        Map<Integer, Integer> hashMap = new HashMap<>(m);
        for (var i = 0; i < m; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
            hashMap.put(target[i], hashMap.getOrDefault(target[i], 0) - 1);
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (!entry.getValue().equals(0)) {
                return false;
            }
        }
        return true;
    }
}
