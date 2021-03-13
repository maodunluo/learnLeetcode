package com.yyc.learnleetcode.learnalgorithms.a1356;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1356. Sort Integers by The Number of 1 Bits
 *
 * @author yuechao
 */
public class Solution {

  public int[] sortByBits(int[] arr) {
    Map<Integer, List<Integer>> resultMap = new HashMap<>(arr.length);
    for (int i : arr) {
      int bit1Count = 0;
      int number = i;
      while (number != 0) {
        if (number % 2 != 0) {
          bit1Count++;
        }
        number /= 2;
      }
      List<Integer> tempList = resultMap.getOrDefault(bit1Count, new ArrayList<>());
      tempList.add(i);
      resultMap.put(bit1Count, tempList);
    }
    int[] result = new int[arr.length];
    List<Integer> keyList = resultMap.keySet().stream().sorted().collect(Collectors.toList());
    List<Integer> valueList = new ArrayList<>();
    for (Integer key : keyList) {
      resultMap.get(key).sort(Comparator.comparingInt(value -> value));
      valueList.addAll(resultMap.get(key));
    }
    for (int i = 0; i < valueList.size(); i++) {
      result[i] = valueList.get(i);
    }
    return result;
  }
}
