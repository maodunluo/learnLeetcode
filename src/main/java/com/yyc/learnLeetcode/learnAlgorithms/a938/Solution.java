package com.yyc.learnLeetcode.learnAlgorithms.a938;

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
     * @param L    最小值
     * @param R    最大值
     * @return 这区间内的和
     */
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        if (L <= root.val && root.val <= R) {
            result += root.val;
        }
        result += rangeSumBST(root.left, L, R);
        result += rangeSumBST(root.right, L, R);
        return result;
    }

    public int simpleRangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (root.val < L) {
            return simpleRangeSumBST(root.right, L, R);
        } else if (root.val > R) {
            return simpleRangeSumBST(root.left, L, R);
        } else {
            return root.val + simpleRangeSumBST(root.right, L, R) + simpleRangeSumBST(root.left, L, R);
        }
    }
}

