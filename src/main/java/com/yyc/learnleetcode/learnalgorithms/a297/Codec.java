package com.yyc.learnleetcode.learnalgorithms.a297;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yuechao
 */
public class Codec {

  /**
   * Encodes a tree to a single string.
   *
   * @param root 根结点
   * @return 字符串类型
   */
  public String serialize(TreeNode root) {
    // 用bfs
    StringBuilder result = new StringBuilder();
    Deque<TreeNode> deque = new LinkedList<>();
    deque.push(root);
    while (deque.size() != 0) {
      TreeNode node = deque.pop();
      if (node != null) {
        result.append(node.val).append(",");
        deque.addLast(node.left);
        deque.addLast(node.right);
      } else {
        result.append("null,");
      }
    }
    if (result.length() > 0) {
      result = new StringBuilder(result.substring(0, result.length() - 1));
    }
    return result.toString();
  }

  public TreeNode deserialize(String data) {
    if ("null".equals(data)) {
      return null;
    }
    String[] nodes = data.split(",");
    Deque<TreeNode> queue = new ArrayDeque<>();
    TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
    queue.addLast(root);
    int i = 1;
    while (!queue.isEmpty()) {
      TreeNode curr = queue.removeFirst();
      curr.left = "null".equals(nodes[i]) ? null : new TreeNode(Integer.parseInt(nodes[i]));
      curr.right = "null".equals(nodes[i + 1]) ? null : new TreeNode(Integer.parseInt(nodes[i + 1]));
      if (curr.left != null) {
        queue.addLast(curr.left);
      }
      if (curr.right != null) {
        queue.addLast(curr.right);
      }
      i += 2;
    }
    return root;
  }

}
