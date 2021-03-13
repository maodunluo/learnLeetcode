package com.yyc.learnleetcode.learnalgorithms.a559;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

  private Node node;

  @BeforeEach
  void init() {
    Node node14 = new Node(14);
    Node node11 = new Node(11, List.of(node14));
    Node node7 = new Node(7, List.of(node11));
    Node node6 = new Node(6);
    Node node3 = new Node(3, List.of(node6, node7));
    Node node12 = new Node(12);
    Node node8 = new Node(8, List.of(node12));
    Node node4 = new Node(4, List.of(node8));
    Node node13 = new Node(13);
    Node node9 = new Node(9, List.of(node13));
    Node node10 = new Node(10);
    Node node5 = new Node(5, List.of(node9, node10));
    Node node2 = new Node(2);
    node = new Node(1, List.of(node2, node3, node4, node5));
  }

  @Test
  void maxDepthTest() {
    assertEquals(5, new Solution().maxDepth(node));
  }
}