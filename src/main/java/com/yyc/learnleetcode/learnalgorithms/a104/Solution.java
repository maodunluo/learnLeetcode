package com.yyc.learnleetcode.learnalgorithms.a104;

/**
 * 104. Maximum Depth of Binary Tree
 *
 * @author yuechao
 */
public class Solution {

  public int maxDepth(TreeNode root) {
    int depth = 0;
    return getDepth(root, depth);
  }

  private int getDepth(TreeNode root, int depth) {
    if (root == null) {
      return depth;
    }
    depth++;
    return Math.max(getDepth(root.left, depth), getDepth(root.right, depth));
  }

}
