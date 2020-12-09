package com.yyc.learnleetcode.learnalgorithms.a897;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuechao
 */
public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inOrder(values, root);
        TreeNode node = new TreeNode();
        buildNewTree(values, node);
        return node;
    }

    /**
     * 创建一个新的tree
     *
     * @param values 存储treeNode的val的list
     * @param node treeNode
     */
    private void buildNewTree(List<Integer> values, TreeNode node) {
        node.val = values.get(0);
        values.remove(0);
        if (values.isEmpty()) {
            return;
        }
        node.right = new TreeNode();
        buildNewTree(values, node.right);
    }

    /**
     * 中序遍历出按顺序递增的list
     *
     * @param values 存储treeNode的val的list
     * @param root treeNode
     */
    private void inOrder(List<Integer> values, TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(values, root.left);
        values.add(root.val);
        inOrder(values, root.right);
    }
}
