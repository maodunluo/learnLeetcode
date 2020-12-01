package com.yyc.learnLeetcode.learnAlgorithms.a1469;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuechao
 */
public class Solution {
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
