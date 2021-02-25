package com.yyc.learnleetcode.learnalgorithms.a1441;

import java.util.ArrayList;
import java.util.List;

/**
 * 1441. Build an Array With Stack Operations
 *
 * @author yuechao
 */
public class Solution {

  public List<String> buildArray(int[] target, int n) {
    List<String> resultList = new ArrayList<>();
    int flag = 1;
    for (int i1 : target) {
      for (int j = flag; j <= i1; j++) {
        resultList.add("Push");
        if (i1 != j) {
          resultList.add("Pop");
        }
      }
      flag = i1 + 1;
    }
    return resultList;
  }
}
