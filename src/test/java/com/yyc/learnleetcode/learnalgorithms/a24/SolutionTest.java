package com.yyc.learnleetcode.learnalgorithms.a24;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))),
            new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))))
        },
        new Object[]{
            null,
            null
        },
        new Object[]{
            new ListNode(1),
            new ListNode(1)
        }

    );
  }


  @ParameterizedTest
  @MethodSource("dataProvider")
  void swapPairsTest(ListNode input, ListNode expected) {
    assertEquals(expected, new Solution().swapPairs(input));
  }

  @Test
  void swapThreeNodesTest() {
    ListNode head = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
    ListNode expected = new ListNode(3,
        new ListNode(2, new ListNode(1, new ListNode(6, new ListNode(5, new ListNode(4))))));
    assertEquals(expected, new Solution().swapThreeNodes(head));
  }

}