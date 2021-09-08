package com.yyc.learnleetcode.learnalgorithms.a448;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 *
 * @author yuechao
 */
public class Solution {

  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> result = new ArrayList<>();
    int[] array = new int[nums.length];
    for (int num : nums) {
      array[num - 1] = num;
    }
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 0) {
        result.add(i + 1);
      }
    }
    return result;
  }
}
