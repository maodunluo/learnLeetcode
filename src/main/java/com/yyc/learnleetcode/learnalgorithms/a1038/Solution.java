package com.yyc.learnleetcode.learnalgorithms.a1038;

/**
 * @author admin
 */
public class Solution {

  public TreeNode bstToGst(TreeNode root) {

    // 1。遍历所有节点，用中序排序
    int[] sum = {0};
    dfs(root, sum);
    return root;
  }

  public void dfs(TreeNode root, int[] sum) {
    if (root == null) {
      return;
    }
    dfs(root.right, sum);
    sum[0] += root.val;
    root.val = sum[0];
    dfs(root.left, sum);
  }

}