package com.yyc.learnleetcode.learnalgorithms.a117;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author yuechao
 */
public class Solution {

  public Node connect(Node root) {
    if (root == null) {
      return null;
    }
    Deque<Node> deque = new ArrayDeque<>();
    deque.add(root);
    deque.add(new Node(-1001));
    while (!deque.isEmpty()) {
      Node node = deque.removeFirst();
      Node peek = deque.peek();
      if (peek == null) {
        break;
      }
      if (node.left != null) {
        deque.add(node.left);
      }
      if (node.right != null) {
        deque.add(node.right);
      }
      // 说明这一层遍历完了
      if (peek.val == -1001) {
        node.next = null;
        deque.removeFirst();
        // 判断是否全部节点遍历完成
        deque.addLast(new Node(-1001));
        if (deque.size() == 1) {
          break;
        }
      } else {
        node.next = peek;
      }
    }
    return root;
  }
}