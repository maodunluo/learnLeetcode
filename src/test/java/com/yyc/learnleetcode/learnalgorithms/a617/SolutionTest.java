package com.yyc.learnleetcode.learnalgorithms.a617;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    TreeNode tree1_1 = new TreeNode();
    TreeNode tree1_3 = new TreeNode();
    TreeNode tree1_2 = new TreeNode();
    TreeNode tree1_5 = new TreeNode();
    TreeNode tree2_2 = new TreeNode();
    TreeNode tree2_1 = new TreeNode();
    TreeNode tree2_3 = new TreeNode();
    TreeNode tree2_4 = new TreeNode();
    TreeNode tree2_7 = new TreeNode();

    TreeNode tree3_3 = new TreeNode();
    TreeNode tree3_4 = new TreeNode();
    TreeNode tree3_5 = new TreeNode();
    TreeNode tree3_5c1 = new TreeNode();
    TreeNode tree3_4c1 = new TreeNode();
    TreeNode tree3_7 = new TreeNode();

    @BeforeEach
    void initTree() {
        tree1_1.val = 1;
        tree1_3.val = 3;
        tree1_2.val = 2;
        tree1_5.val = 5;
        tree1_3.left = tree1_5;
        tree1_1.left = tree1_3;
        tree1_1.right = tree1_2;

        tree2_2.val = 2;
        tree2_1.val = 1;
        tree2_3.val = 3;
        tree2_4.val = 4;
        tree2_7.val = 7;
        tree2_1.right = tree2_4;
        tree2_3.right = tree2_7;
        tree2_2.left = tree2_1;
        tree2_2.right = tree2_3;

        tree3_3.val = 3;
        tree3_4.val = 4;
        tree3_5.val = 5;
        tree3_5c1.val = 5;
        tree3_4c1.val = 4;
        tree3_7.val = 7;
        tree3_4.left = tree3_5c1;
        tree3_4.right = tree3_4c1;
        tree3_5.right = tree3_7;
        tree3_3.left = tree3_4;
        tree3_3.right = tree3_5;

    }

    @Test
    void mergeTrees() {
        assertEquals(tree3_3, new Solution().mergeTrees(tree1_1, tree2_2));
    }

    @Test
    void simpleMergeTrees() {
        assertEquals(tree3_3, new Solution().simpleMergeTrees(tree1_1, tree2_2));
    }
}