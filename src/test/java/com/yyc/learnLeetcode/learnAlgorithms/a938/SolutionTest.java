package com.yyc.learnLeetcode.learnAlgorithms.a938;

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
    void rangeSumBST() {
        assertEquals(32, new Solution().rangeSumBST(nodeVal110, 7, 15));
    }

    @Test
    void simpleRangeSumBST() {
        assertEquals(32, new Solution().simpleRangeSumBST(nodeVal110, 7, 15));
    }
}