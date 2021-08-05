package com.yyc.learnleetcode.learnalgorithms.a1710;

import java.util.Arrays;

/**
 * 1710. Maximum Units on a Truck
 *
 * @author yuechao
 */
public class Solution {

  public int maximumUnits(int[][] boxTypes, int truckSize) {
    Arrays.sort(boxTypes, (boxType1, boxType2) -> boxType2[1] - boxType1[1]);
    var result = 0;
    for (int[] boxType : boxTypes) {
      if (boxType[0] < truckSize) {
        result += boxType[0] * boxType[1];
        truckSize -= boxType[0];
      } else {
        result += truckSize * boxType[1];
        break;
      }
    }
    return result;
  }
}
