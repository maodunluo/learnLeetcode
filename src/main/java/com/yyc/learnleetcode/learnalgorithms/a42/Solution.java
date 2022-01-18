package com.yyc.learnleetcode.learnalgorithms.a42;

/**
 * 42. Trapping Rain Water
 *
 * @author yuechao
 */
public class Solution {

  public int trap(int[] height) {
    int result = 0;
    for (int i = 0; i < height.length; i++) {
      final int min = Math.min(getLeftMax(i, height),
          getRightMax(i, height));
      result += (min - height[i]);

    }
    return result;
  }

  private int getLeftMax(int index, int[] height) {
    int result = height[index];
    for (int i = index; i >= 0; i--) {
      if (height[i] > result) {
        result = height[i];
      }
    }
    return result;
  }

  private int getRightMax(int index, int[] height) {
    int result = height[index];
    for (int i = index; i < height.length; i++) {
      if (height[i] > result) {
        result = height[i];
      }
    }
    return result;
  }

}
