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

  public int trapV2(int[] height) {
    // 找出该节点左边最大的数组
    int[] leftMaxArray = new int[height.length];
    // 该节点右边最大的元素组成的数组。
    int[] rightMaxArray = new int[height.length];
    leftMaxArray[0] = height[0];
    for (int i = 1; i < height.length; i++) {
      leftMaxArray[i] = Math.max(height[i], leftMaxArray[i - 1]);
    }
    rightMaxArray[height.length - 1] = height[height.length - 1];
    for (int i = height.length - 2; i >= 0; i--) {
      rightMaxArray[i] = Math.max(height[i], rightMaxArray[i + 1]);
    }
    int result = 0;
    for (int i = 0; i < height.length; i++) {
      result += (Math.min(leftMaxArray[i], rightMaxArray[i]) - height[i]);
    }
    return result;
  }

  public int trapV3(int[] height) {
    int result = 0;
    int leftIndex = 0;
    int rightIndex = height.length - 1;
    int maxLeft = height[0];
    int maxRight = height[height.length - 1];
    while (leftIndex < rightIndex) {
      if (maxLeft < maxRight) {
        result += (maxLeft - height[leftIndex]);
        maxLeft = Math.max(maxLeft, height[++leftIndex]);
      } else {
        result += (maxRight - height[rightIndex]);
        maxRight = Math.max(maxRight, height[--rightIndex]);
      }
    }
    return result;
  }

}
