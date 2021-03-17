package com.yyc.learnleetcode.learnalgorithms.a893;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 893. Groups of Special-Equivalent Strings
 *
 * @author yuechao
 */
public class Solution {

  public int numSpecialEquivGroups(String[] inputArray) {
    Map<Integer, List<List<Character>>> indexMap = new HashMap<>(inputArray.length);
    for (int index = 0; index < inputArray.length; index++) {
      List<List<Character>> setList = new ArrayList<>();
      List<Character> evenList = new ArrayList<>();
      List<Character> oddList = new ArrayList<>();
      for (int i = 0; i < inputArray[index].length(); i++) {
        if (i % 2 != 0) {
          evenList.add(inputArray[index].charAt(i));
        } else {
          oddList.add(inputArray[index].charAt(i));
        }
      }
      evenList.sort(Comparator.comparingInt(o -> o));
      oddList.sort(Comparator.comparingInt(o -> o));
      setList.add(evenList);
      setList.add(oddList);
      indexMap.put(index, setList);
    }
    long count = indexMap.values().stream().distinct().count();
    return (int) count;
  }
}
