package com.yyc.learnleetcode.learnalgorithms.a938;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    TreeNode nodeVal3 = new TreeNode(3, null, null);
    TreeNode nodeVal7 = new TreeNode(7, null, null);
    TreeNode nodeVal18 = new TreeNode(18, null, null);
    TreeNode nodeVal5 = new TreeNode(5, nodeVal3, nodeVal7);
    TreeNode nodeVal15 = new TreeNode(15, null, nodeVal18);
    TreeNode nodeVal110 = new TreeNode(10, nodeVal5, nodeVal15);

    @Test
    void rangeSumBst() {
        assertEquals(32, new Solution().rangeSumBst(nodeVal110, 7, 15));
    }

    @Test
    void simpleRangeSumBst() {
        assertEquals(32, new Solution().simpleRangeSumBst(nodeVal110, 7, 15));
    }
}