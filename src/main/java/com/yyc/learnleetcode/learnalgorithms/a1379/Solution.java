package com.yyc.learnleetcode.learnalgorithms.a1379;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author admin
 */
public class Solution {

  public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
    return dfs(original, cloned, target);
  }


  private TreeNode dfs(TreeNode original, TreeNode cloned, TreeNode target) {
    TreeNode node;
    if (cloned == null || original == target) {
      return cloned;
    }
    node = dfs(original.left, cloned.left, target);
    if (node == null) {
      node = dfs(original.right, cloned.right, target);
    }
    return node;
  }

  public final TreeNode getTargetCopyBfs(final TreeNode original, final TreeNode cloned, final TreeNode target) {
    Deque<TreeNode> deque = new LinkedList<>();
    // 这里就相当于一个reference，不会改变原来树的结构。
    TreeNode node = original;
    TreeNode clonedNode = cloned;
    while(node != null || !deque.isEmpty()) {
      if (node != null) {
        if (node == target) {
          return clonedNode;
        }
        deque.push(clonedNode);
        deque.push(node);
        node = node.left;
        clonedNode = clonedNode.left;
      } else {
        node = deque.pop().right;
        clonedNode = deque.pop().right;
      }
    }
    return null;
  }

}