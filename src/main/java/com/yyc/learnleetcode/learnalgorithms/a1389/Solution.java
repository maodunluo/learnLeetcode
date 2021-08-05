package com.yyc.learnleetcode.learnalgorithms.a1389;

/**
 * Create Target Array in the Given Order spend a lot of time
 *
 * @author yuechao
 */
public class Solution {

  public int[] createTargetArray(int[] nums, int[] index) {
    //新建一个数组，然后将数字一个一个插入进去。
    var result = new int[nums.length];
    result[0] = nums[index[0]];
    for (var i = 1; i < nums.length; i++) {
      if (nums.length - 1 - index[i] >= 0) {
        System.arraycopy(result, index[i], result, index[i] + 1, nums.length - 1 - index[i]);
      }
      result[index[i]] = nums[i];
    }
    return result;
  }

    public int[] createTargetArray2(int[] nums, int[] index) {
        //新建一个数组，然后将数字一个一个插入进去。
        int[] result = new int[nums.length];
        result[0] = nums[index[0]];
        for (var i = 1; i < nums.length; i++) {
            for (int j = nums.length -1 ; j > index[i];j--) {
                result[j] = result[j - 1];
            }
            result[index[i]] = nums[i];
        }
        return result;
    }
}
