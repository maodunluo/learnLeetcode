package com.yyc.learnleetcode.learnalgorithms.a897;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

  TreeNode node1 = new TreeNode(1);
  TreeNode node2 = new TreeNode(2);
  TreeNode node3 = new TreeNode(3);
  TreeNode node4 = new TreeNode(4);
  TreeNode node5 = new TreeNode(5);
  TreeNode node6 = new TreeNode(6);
  TreeNode node7 = new TreeNode(7);
  TreeNode node8 = new TreeNode(8);
  TreeNode node9 = new TreeNode(9);

  TreeNode newNode1 = new TreeNode(1);
  TreeNode newNode2 = new TreeNode(2);
  TreeNode newNode3 = new TreeNode(3);
  TreeNode newNode4 = new TreeNode(4);
  TreeNode newNode5 = new TreeNode(5);
  TreeNode newNode6 = new TreeNode(6);
  TreeNode newNode7 = new TreeNode(7);
  TreeNode newNode8 = new TreeNode(8);
  TreeNode newNode9 = new TreeNode(9);

  @BeforeEach
  void init() {
    node8.left = node7;
    node8.right = node9;
    node6.right = node8;
    node5.right = node6;
    node2.left = node1;
    node3.left = node2;
    node3.right = node4;
    node5.left = node3;

    newNode8.right = newNode9;
    newNode7.right = newNode8;
    newNode6.right = newNode7;
    newNode5.right = newNode6;
    newNode4.right = newNode5;
    newNode3.right = newNode4;
    newNode2.right = newNode3;
    newNode1.right = newNode2;
  }

  @Test
  void increasingBST() {
    assertEquals(newNode1, new Solution().increasingBST(node5));
  }

  private void preOrder(TreeNode node) {
    if (node == null) {
      return;
    }
    System.out.println(node.val);
    preOrder(node.left);
    preOrder(node.right);
  }

  private void inOrder(TreeNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.println(node.val);
    inOrder(node.right);
  }

  private void postOrder(TreeNode node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.val);
  }

}