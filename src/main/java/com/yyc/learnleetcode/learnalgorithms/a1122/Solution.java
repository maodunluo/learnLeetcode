package com.yyc.learnleetcode.learnalgorithms.a1122;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1122. Relative Sort Array
 *
 * @author yuechao
 */
public class Solution {

  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    Map<Integer, Integer> elementCountMap = new HashMap<>(8);
    for (int value : arr1) {
      elementCountMap.put(value, elementCountMap.getOrDefault(value, 0) + 1);
    }
    var result = new int[arr1.length];
    var count = 0;
    for (int value : arr2) {
      for (var j = 0; j < elementCountMap.get(value); j++) {
        result[count++] = value;
      }
      elementCountMap.remove(value);
    }
    List<Integer> keyList = elementCountMap.keySet().stream()
        .sorted(Comparator.comparingInt(o -> o)).collect(Collectors.toList());
    for (Integer key: keyList) {
      for (var i = 0; i < elementCountMap.get(key); i++) {
        result[count++] = key;
      }
    }
    return result;
  }
}
