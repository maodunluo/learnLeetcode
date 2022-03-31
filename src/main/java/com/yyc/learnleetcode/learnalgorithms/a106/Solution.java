package com.yyc.learnleetcode.learnalgorithms.a106;

/**
 * @author admin
 */
public class Solution {

  // 中序遍历：左中右
  // 后续遍历，左右中
  int index = 0;
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    return buildTreeInternal(inorder, postorder, 0, inorder.length);
  }

  private TreeNode buildTreeInternal(int[] inorder, int[] postorder, int left, int right) {
    // 边界，校验入参和递归跳出条件
    if (left >= right) {
      return null;
    }
    if (index >= postorder.length) {
      return null;
    }
    // 递归处理函数
    TreeNode root = new TreeNode(postorder[postorder.length -1 - index]);
    int val = root.val;
    int pos = find(inorder, left, right, val);
    index++;
    root.right = buildTreeInternal(inorder, postorder, pos+1, right);
    root.left = buildTreeInternal(inorder, postorder, left, pos);
    return root;
  }

  private int find(int[] inOrder, int left, int right, int val) {
    for (int i = left; i < right; i++) {
      if (inOrder[i] == val) {
        return i;
      }
    }
    return -1;
  }


}