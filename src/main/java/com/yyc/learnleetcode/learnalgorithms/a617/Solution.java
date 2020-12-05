package com.yyc.learnleetcode.learnalgorithms.a617;

/**
 * 第一种方法包含了重复判断，其实可以进行剪枝操作，并且第一个if判断重复了
 *
 * @author yuechao
 */
public class Solution {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode treeNode = new TreeNode(0, new TreeNode(0), new TreeNode(0));
        if (t1 == null && t2 == null) {
            treeNode = null;
        } else if (t1 == null) {
            treeNode.val = t2.val;
            treeNode.left = mergeTrees(null, t2.left);
            treeNode.right = mergeTrees(null, t2.right);
        } else if (t2 == null) {
            treeNode.val = t1.val;
            treeNode.left = mergeTrees(t1.left, null);
            treeNode.right = mergeTrees(t1.right, null);
        } else {
            treeNode.val = t1.val + t2.val;
            treeNode.left = mergeTrees(t1.left, t2.left);
            treeNode.right = mergeTrees(t1.right, t2.right);
        }
        return treeNode;
    }

    public TreeNode simpleMergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode treeNode = new TreeNode(0);
        if (t1 == null) {
            return t2;
        } else if (t2 == null) {
            return t1;
        } else {
            treeNode.val = t1.val + t2.val;
            treeNode.left = mergeTrees(t1.left, t2.left);
            treeNode.right = mergeTrees(t1.right, t2.right);
        }
        return treeNode;
    }
}
