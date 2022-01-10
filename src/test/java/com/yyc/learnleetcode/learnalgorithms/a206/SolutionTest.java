package com.yyc.learnleetcode.learnalgorithms.a206;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution solution = new Solution();

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
            new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))))
        },
        new Object[]{
            new ListNode(1, new ListNode(2)),
            new ListNode(2, new ListNode(1))
        },
        new Object[]{
          new ListNode(),
          new ListNode()
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void reverseListTest(ListNode input, ListNode expect) {
    assertEquals(expect, solution.reverseList(input));
  }
}