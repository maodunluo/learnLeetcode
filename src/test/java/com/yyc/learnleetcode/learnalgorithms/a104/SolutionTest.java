package com.yyc.learnleetcode.learnalgorithms.a104;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution solution = new Solution();

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))),
            3
        },
        new Object[]{
            new TreeNode(1, null, new TreeNode(2)),
            2
        },
        new Object[]{
            null,
            0
        },
        new Object[]{
            new TreeNode(0),
            1
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void maxDepthTest(TreeNode treeNode, int expect) {
    assertThat(solution.maxDepth(treeNode)).isEqualTo(expect);
  }

}