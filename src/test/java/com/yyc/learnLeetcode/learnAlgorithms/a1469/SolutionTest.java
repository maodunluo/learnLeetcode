package com.yyc.learnLeetcode.learnAlgorithms.a1469;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    @Test
    void getLonelyNodesTest() {
        TreeNode treeNodeLeft = new TreeNode(2, null, new TreeNode(4));
        TreeNode treeNode = new TreeNode(1, treeNodeLeft, new TreeNode(3));
        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        assertEquals(expected, new Solution().getLonelyNodes(treeNode));
    }

    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        getLonelyNodes(root, false, result);
        return result;
    }

    private void getLonelyNodes(TreeNode root, boolean lonely, List<Integer> result) {
        if (root == null) {
            return;
        }

        if (lonely) {
            result.add(root.val);
        }
        getLonelyNodes(root.left, root.right == null, result);
        getLonelyNodes(root.right, root.left == null, result);
    }
}