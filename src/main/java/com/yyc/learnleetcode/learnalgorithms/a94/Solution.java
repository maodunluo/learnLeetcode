package com.yyc.learnleetcode.learnalgorithms.a94;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 */
public class Solution {

  List<Integer> result = new ArrayList<>();

  public List<Integer> inorderTraversal(TreeNode root) {
    return dfs(root);
  }

  private List<Integer> dfs(TreeNode root) {
    if (root != null) {
      dfs(root.left);
      result.add(root.val);
      dfs(root.right);
    }
    return result;
  }

}