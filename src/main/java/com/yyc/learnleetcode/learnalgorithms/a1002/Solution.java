package com.yyc.learnleetcode.learnalgorithms.a1002;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1002. Find Common Characters
 *
 * @author yuechao
 */
public class Solution {

  public List<String> commonChars(String[] inputStringArray) {
    List<Map<Character, Integer>> mapList = new ArrayList<>();
    for (String inputString : inputStringArray) {
      Map<Character, Integer> charCountMap = new HashMap<>(inputString.length());
      for (int i = 0; i < inputString.length(); i++) {
        char c = inputString.charAt(i);
        Integer defaultValue = charCountMap.getOrDefault(c, 0);
        charCountMap.put(c, defaultValue + 1);
      }
      mapList.add(charCountMap);
    }
    List<String> result = new ArrayList<>();
    for (Character character : mapList.get(0).keySet()) {
      List<Integer> valueList = new ArrayList<>();
      for (Map<Character, Integer> characterIntegerMap : mapList) {
        Integer integer = characterIntegerMap.getOrDefault(character, 0);
        valueList.add(integer);
      }
      valueList.sort(Comparator.comparingInt(o -> o));
      Integer integer = valueList.get(0);
      for (int i = 0; i < integer; i++) {
        result.add(character.toString());
      }
    }
    return result;
  }

}
