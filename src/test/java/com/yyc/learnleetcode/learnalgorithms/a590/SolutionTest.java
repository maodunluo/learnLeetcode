package com.yyc.learnleetcode.learnalgorithms.a590;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Node node1 = new Node();
    Node node2 = new Node();
    Node node3 = new Node();
    Node node4 = new Node();
    Node node5 = new Node();
    Node node6 = new Node();
    List<Integer> expected = new ArrayList<>();

    @BeforeEach
    void init() {
        node1.val = 1;
        node2.val = 2;
        node3.val = 3;
        node4.val = 4;
        node5.val = 5;
        node6.val = 6;
        node3.children = new ArrayList<>();
        node3.children.add(node5);
        node3.children.add(node6);
        node1.children = new ArrayList<>();
        node1.children.add(node3);
        node1.children.add(node2);
        node1.children.add(node4);

        expected.add(5);
        expected.add(6);
        expected.add(3);
        expected.add(2);
        expected.add(4);
        expected.add(1);
    }

    @Test
    void postorder() {
        assertEquals(expected, new Solution().postorder(node1));
    }

    @Test
    void postOrderUseStack() {
        assertEquals(expected, new Solution().postOrderUseStack(node1));
    }

    @Test
    void postOrderUseDeque() {
        assertEquals(expected, new Solution().postOrderUseDeque(node1));
    }
}