package com.yyc.learnleetcode.learnalgorithms.a1022;

/**
 * 1022. Sum of Root To Leaf Binary Numbers
 * 未知量为叶子节点的和以及所有叶子节点的和
 *
 * @author yuechao
 */
public class Solution {
    int result;
    public int sumRootToLeaf(TreeNode root) {
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        sum = sum * 2 + root.val;
        if (root.left == null && root.right == null) {
            result+= sum;
        }
        helper(root.left, sum);
        helper(root.right, sum);
    }
}
