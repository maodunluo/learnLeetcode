package com.yyc.learnleetcode.learnalgorithms.a1019;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  public static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new ListNode(2, new ListNode(1, new ListNode(5))),
            new int[]{5, 5, 0}
        },
        new Object[]{
            new ListNode(2, new ListNode(7, new ListNode(4, new ListNode(3, new ListNode(5))))),
            new int[]{7, 0, 5, 5, 0}
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void nextLargerNodesTest(ListNode input, int[] expected) {
    assertArrayEquals(expected, new Solution().nextLargerNodes(input));

  }


}