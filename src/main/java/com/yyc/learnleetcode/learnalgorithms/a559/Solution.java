package com.yyc.learnleetcode.learnalgorithms.a559;

import java.util.ArrayList;
import java.util.List;

/**
 * 559. Maximum Depth of N-ary Tree
 *
 * @author yuechao
 */
public class Solution {

  public int maxDepth(Node root) {
    if (root == null) {
      return 0;
    }
    var depth = 1;
    return maxDepth(root.getChildren(), depth);
  }

  private int maxDepth(List<Node> nodeList, int depth) {
    if (nodeList == null || nodeList.isEmpty()) {
      return depth;
    }
    depth++;
    List<Integer> depthList = new ArrayList<>();
    for (Node node : nodeList) {
      depthList.add(maxDepth(node.getChildren(), depth));
    }
    depthList.sort((o1, o2) -> o2 - o1);
    return depthList.get(0);
  }
}
