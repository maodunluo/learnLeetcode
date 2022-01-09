package com.yyc.learnleetcode.learnalgorithms.a19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
            2,
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))))
        },
        new Object[]{
            new ListNode(1),
            1,
            null
        },
        new Object[]{
            new ListNode(1, new ListNode(2)),
            1,
            new ListNode(1)
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void removeNthFromEndTest(ListNode head, int n, ListNode expected) {
    assertEquals(expected, new Solution().removeNthFromEnd(head, n));
  }

}