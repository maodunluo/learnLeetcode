package com.yyc.learnleetcode.learnalgorithms.a21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new ListNode(1, new ListNode(2, new ListNode(4))),
            new ListNode(1, new ListNode(3, new ListNode(4))),
            new ListNode(1,
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))))
        },
        new Object[]{
            null,
            null,
            null
        },
        new Object[]{
            null,
            new ListNode(0),
            new ListNode(0)
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void mergeTwoListsTest(ListNode inputL1, ListNode inputL2, ListNode expected) {
    assertEquals(expected, new Solution().mergeTwoLists(inputL1, inputL2));
  }
}