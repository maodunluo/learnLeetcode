package com.yyc.learnleetcode.learnalgorithms.a1315;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author yuechao
 */
public class Solution {

  public int sumEvenGrandparent(TreeNode root) {
    // 可以用bfs来做,这种方法sum作为入参，会改变，太low了
    int sum = 0;
    Deque<TreeNode> deque = new ArrayDeque<>();
    deque.push(root);
    while (deque.size() != 0) {
      for (int i = deque.size(); i > 0 ; i--) {
        TreeNode node = deque.pop();
        TreeNode left = node.left;
        TreeNode right = node.right;
        sum = getSum(sum, deque, node, left);
        sum = getSum(sum, deque, node, right);
      }
    }
    return sum;
  }

  private int getSum(int sum, Deque<TreeNode> deque, TreeNode node, TreeNode right) {
    if (right != null) {
      TreeNode left1 = right.left;
      TreeNode right1 = right.right;
      if (node.val % 2 == 0) {
        if (left1 != null) {
          sum += left1.val;
        }
        if (right1 != null) {
          sum += right1.val;
        }
      }
      deque.push(right);
    }
    return sum;
  }

  public int sumEvenGrandparentV2(TreeNode root) {
    int[] sum = {0};
    dfs(root, sum);
    return sum[0];
  }

  public void dfs(TreeNode root, int[] sum) {
    if (root == null) {
      return;
    }
    TreeNode left = root.left;
    TreeNode right = root.right;
    if (root.val % 2 == 0) {
      if (left != null && left.left != null) {
        sum[0] += left.left.val;
      }
      if (left != null && left.right != null) {
        sum[0] += left.right.val;
      }
      if (right != null && right.left != null) {
        sum[0] += right.left.val;
      }
      if (right != null && right.right != null) {
        sum[0] += right.right.val;
      }
    }
    dfs(root.left, sum);
    dfs(root.right, sum);
  }


}