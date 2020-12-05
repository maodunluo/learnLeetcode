package com.yyc.learnleetcode.learnalgorithms.a938;

/**
 * Range Sum of BST
 *
 * @author yuechao
 */
public class Solution {
    /**
     * 这个方法多判断了，因为题意是二叉搜索树
     * 左侧的节点小于根节点并且根结点小于右侧节点，可以利用这个属性来优化
     *
     * @param root 根结点
     * @param left    最小值
     * @param right    最大值
     * @return 这区间内的和
     */
    public int rangeSumBST(TreeNode root, int left, int right) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        if (left <= root.val && root.val <= right) {
            result += root.val;
        }
        result += rangeSumBST(root.left, left, right);
        result += rangeSumBST(root.right, left, right);
        return result;
    }

    public int simpleRangeSumBST(TreeNode root, int left, int right) {
        if (root == null) {
            return 0;
        }
        if (root.val < left) {
            return simpleRangeSumBST(root.right, left, right);
        } else if (root.val > right) {
            return simpleRangeSumBST(root.left, left, right);
        } else {
            return root.val + simpleRangeSumBST(root.right, left, right) + simpleRangeSumBST(root.left, left, right);
        }
    }
}

