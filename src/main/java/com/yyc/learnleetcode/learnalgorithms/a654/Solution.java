package com.yyc.learnleetcode.learnalgorithms.a654;

/**
 * @author admin
 */
public class Solution {

  public TreeNode constructMaximumBinaryTree(int[] nums) {
    return dfs(nums, 0, nums.length);
  }

  private TreeNode dfs(int[] nums, int left, int right) {
    if (left >= right) {
      return null;
    }
    if (left >= nums.length || right > nums.length) {
      return null;
    }
    int maxIndex = find(nums, left, right);
    TreeNode root = new TreeNode(nums[maxIndex]);
    root.left = dfs(nums, left, maxIndex);
    root.right = dfs(nums, maxIndex + 1, right);
    return root;
  }

  private int find(int[] nums, int left, int right) {
    int maxIndex = left;
    for (int i = left; i < right; i++) {
      if (nums[i] > nums[maxIndex]) {
        maxIndex = i;
      }
    }
    return maxIndex;
  }

}