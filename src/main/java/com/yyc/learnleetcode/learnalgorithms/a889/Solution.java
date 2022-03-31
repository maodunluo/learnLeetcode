package com.yyc.learnleetcode.learnalgorithms.a889;

/**
 * 889. Construct Binary Tree from Preorder and Postorder Traversal
 *
 * @author yuechao
 */
public class Solution {

  public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
    return buildTreeInternal(preorder, postorder, 0, preorder.length);
  }

  int index = 0;
  private TreeNode buildTreeInternal(int[] preorder, int[] postorder, int left, int right) {
    if (left < 0) {
      return null;
    }
    if (left >= right) {
      return null;
    }
    if (index > preorder.length -1) {
      return null;
    }
    TreeNode root = new TreeNode(postorder[postorder.length - 1 - index]);
    if (index == preorder.length -1) {
      return root;
    }
    final int preValue = postorder[postorder.length - 2 - index];
    index++;
    int pos = find(preorder, left, right, preValue);
    root.right = buildTreeInternal(preorder, postorder, pos, right);
    root.left = buildTreeInternal(preorder, postorder, left+1, pos);
    return root;
  }

  private int find(int[] preorder, int left, int right, int val) {
    for (int i = left; i < right; i++) {
      if (preorder[i] == val) {
        return i;
      }
    }
    return -1;
  }


}
