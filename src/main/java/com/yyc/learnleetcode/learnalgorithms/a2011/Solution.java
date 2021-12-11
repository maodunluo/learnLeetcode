package com.yyc.learnleetcode.learnalgorithms.a2011;

/**
 * 2011. Final Value of Variable After Performing Operations
 *
 * @author yuechao
 */
public class Solution {

  public int finalValueAfterOperations(String[] operations) {
    int result = 0;
    for (String operation : operations) {
      if (operation.contains("+")){
        result++;
      } else {
        result--;
      }
    }
    return result;
  }
}
