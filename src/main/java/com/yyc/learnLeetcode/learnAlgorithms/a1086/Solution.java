package com.yyc.learnLeetcode.learnAlgorithms.a1086;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author yuechao
 */
public class Solution {
    public int[][] highFive(int[][] items) {
        sortItems(items);
        int i = 0;
        int cur = items[0][0] + 1;
        int sum = 0;
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int[] arr : items) {
            if (cur == arr[0]) {
                continue;
            }
            i++;
            sum += arr[1];
            if (i == 5) {
                i = 0;
                cur = arr[0];
                map.put(cur, sum / 5);
                sum = 0;
            }
        }
        return convertMapToArr(map);
    }

    private void sortItems(int[][] items) {
        Arrays.sort(items, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            } else {
                return o2[1] - o1[1];
            }
        });
    }

    private int[][] convertMapToArr(LinkedHashMap<Integer, Integer> map) {
        int i = 0;
        int size = map.size();
        int[][] ans = new int[size][2];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans[i][0] = entry.getKey();
            ans[i][1] = entry.getValue();
            i++;
        }
        return ans;
    }
}
