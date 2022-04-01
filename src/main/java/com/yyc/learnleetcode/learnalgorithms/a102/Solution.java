package com.yyc.learnleetcode.learnalgorithms.a102;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author admin
 */
public class Solution {

  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return new ArrayList<>();
    }
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> nodeList = new ArrayList<>();
    Deque<TreeNode> deque = new LinkedList<>();
    deque.add(root);
    deque.add(new TreeNode(-1001));
    while (!deque.isEmpty()) {
      TreeNode node = deque.removeFirst();
      if (node == null) {
        continue;
      }
      // 说明本层已经结束
      if (node.val == -1001) {
        List<Integer> integers = List.copyOf(nodeList);
        result.add(integers);
        nodeList.clear();
        if (deque.isEmpty()) {
          break;
        }
        deque.add(new TreeNode(-1001));
      } else {
        int val = node.val;
        nodeList.add(val);
        if (node.left != null) {
          deque.add(node.left);
        }
        if (node.right != null) {
          deque.add(node.right);
        }
      }
    }
    return result;
  }

}