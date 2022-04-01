package com.yyc.learnleetcode.learnalgorithms.a145;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 */
public class Solution {

  List<Integer> list = new ArrayList<>();

  public List<Integer> postorderTraversal(TreeNode root) {
    dfs(root);
    return list;
  }

  private void dfs(TreeNode root) {
    if (root != null) {
      dfs(root.left);
      dfs(root.right);
      list.add(root.val);
    }
  }

}