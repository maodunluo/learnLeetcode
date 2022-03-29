package com.yyc.learnleetcode.learnalgorithms.a1302;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

  public int deepestLeavesSum(TreeNode root) {
    // 需要将叶子结点的值传进去，可以根据前序遍历来确定？，如何确定哪一层是最深的？
    // 1.首先使用bfs还是dfs
    // 用bfs
    int sum = 0;
    Deque<TreeNode> deque = new ArrayDeque<>();
    deque.push(root);
    while (!deque.isEmpty()) {
      sum = 0;
      for (int size = deque.size(); size > 0; size--) {
        TreeNode node = deque.pop();
        sum += node.val;
        if (node.left != null) {
          deque.offer(node.left);
        }
        if (node.right != null) {
          deque.offer(node.right);
        }
      }
    }
    return sum;
  }


  public int deepestLeavesSumV2(TreeNode root) {
    // 使用dfs
    // 如果传的是常量，出虚拟机栈的时候会被清除，入参改变后没办法带出来
    int[] sum = {0};
    int[] deepestLevel = {0};
    dfs(root, 0, sum, deepestLevel);
    return sum[0];
  }

  private void dfs(TreeNode node, int currentLevel, int[] sum, int[] deepestLevel) {
    if (node == null) {
      return;
    }
    if (currentLevel >= deepestLevel[0]) {
      if (currentLevel > deepestLevel[0]) {
        deepestLevel[0] = currentLevel;
        sum[0] = 0;
      }
      sum[0] += node.val;
    }
    dfs(node.left, currentLevel + 1, sum, deepestLevel);
    dfs(node.right, currentLevel + 1, sum, deepestLevel);
  }

}