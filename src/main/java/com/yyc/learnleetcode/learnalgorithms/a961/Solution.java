package com.yyc.learnleetcode.learnalgorithms.a961;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yuechao
 */
public class Solution {
    public int repeatedNTimes(int[] arr) {
        int result = 0;
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        int count = 0;
        int firstElement = sortedArr[0];
        for (int number : sortedArr) {
            if (number == firstElement) {
                count++;
            }
            if (number != firstElement) {
                count = 1;
                firstElement = number;
            }
            if (count == sortedArr.length / 2) {
                result = number;
                break;
            }
        }
        return result;
    }

    public int repeatedNTimesUseMap(int[] arr) {
        int result = -1;
        Map<Integer, Integer> map = new HashMap<>(arr.length);
        for (int i : arr) {
            map.merge(i, 1, Integer::sum);
        }
        result = getCountEqualsHalfArr(arr, map);
        return result;
    }

    private int getCountEqualsHalfArr(int[] arr, Map<Integer, Integer> map) {
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == arr.length / 2) {
                 result = entry.getKey();
               break;
            }
        }
        return result;
    }

    public int repeatedNTimesUseArr(int[] arr) {
        int[] count = new int[10000];
        for (int a : arr) {
            if (count[a]++ == 1) {
                return a;
            }
        }
        return -1;
    }
}
