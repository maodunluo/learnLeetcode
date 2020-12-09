package com.yyc.learnleetcode.learnalgorithms.a700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    TreeNode node1 = new TreeNode();
    TreeNode node2 = new TreeNode();
    TreeNode node3 = new TreeNode();
    TreeNode node4 = new TreeNode();
    TreeNode node7 = new TreeNode();

    @BeforeEach
    void init() {
        node1.val = 1;
        node2.val = 2;
        node3.val = 3;
        node4.val = 4;
        node7.val = 7;
        node2.left = node1;
        node2.right = node3;
        node4.left = node2;
        node4.right = node7;
    }

    @Test
    void searchBST() {
        assertEquals(node2, new Solution().searchBST(node4, 2));
    }
}