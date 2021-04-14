package com.yyc.learnleetcode.learnalgorithms.a1196;

import java.util.Arrays;

/**
 * 1196. How Many Apples Can You Put into the Basket
 *
 * @author yuechao
 */
public class Solution {

  public int maxNumberOfApples(int[] arr) {
    Arrays.sort(arr);
    int sum = 0;
    int result = arr.length;
    for(int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if(sum >= 5000) {
        result = i;
        break;
      }
    }
    return result;
  }

}
