package com.yyc.learnleetcode.learnalgorithms.a105;

/**
 * @author admin
 */
class Solution {

  int index = 0;

  public TreeNode buildTree(int[] preorder, int[] inorder) {

    //思路
    // 递归三要素：函数，递归边界，（异常值边界，递归结束判断）递推公式
    // 1.函数三要素：这个函数的作用，入参是什么，返回值是什么
    // 像上面那个递归函数，返回值是根节点，这个函数的作用是递归构建一个二叉树。入参是怎么确定的？
    // 构建二叉树，首先需要新建一个节点，然后再递归构建左子树和右子树。新建一个节点，如何确定递推公式。
    // 将前序数组的index放到外面？
    // 意义在于主键减少算法的规模，或者定义一种方式让输入的值尽可能的靠近临界值。意义在于主键减少算法的规模，或者定义一种方式让输入的值尽可能的靠近临界值

    //(前序遍历，后序遍历，中序遍历的第一个下标，中序遍历的最后一个下标）
    return buildTreeInternal(preorder, inorder, 0, inorder.length);
  }

  public TreeNode buildTreeInternal(int[] preorder, int[] inorder, int left, int right) {

    if (left >= right) {

      return null;
    }
    if (index >= preorder.length) {

      return null;
    }
    //下标为index的先序遍历的值
    TreeNode root = new TreeNode(preorder[index]);
    //根据find函数找出root.val对应的索引值
    int pos = find(inorder, left, right, root.val);
    //root.val对应索引值的左边为该root的左半枝
    root.left = buildTreeInternal(preorder, inorder, left, pos);
    //root.val对应索引值的右边为该root的右半枝
    root.right = buildTreeInternal(preorder, inorder, pos + 1, right);
    return root;
  }


  private int find(int[] inOrder, int left, int right, int val) {
    //在中序遍历中找出root.val对应的索引值
    for (int i = left; i < right; i++) {

      if (inOrder[i] == val) {

        return i;
      }
    }
    return -1;
  }

}