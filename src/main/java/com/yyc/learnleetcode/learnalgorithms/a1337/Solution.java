package com.yyc.learnleetcode.learnalgorithms.a1337;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1337. The K Weakest Rows in a Matrix
 *
 * @author yuechao
 */
public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rowSize = mat.length;
        Map<Integer, Integer> rowMap = new HashMap<>(rowSize);
        for (var i = 0; i < rowSize; i++) {
            int[] row = mat[i];
            var count = 0;
            for (int number : row) {
                if (number == 1) {
                    count++;
                }
            }
            rowMap.put(i, count);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(rowMap.entrySet());
        List<Integer> keyList = entryList.stream().sorted(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey).collect(Collectors.toList());
        var result = new int[k];
        for (var i = 0; i < k; i++) {
            result[i] = keyList.get(i);
        }
        return result;
    }
}
