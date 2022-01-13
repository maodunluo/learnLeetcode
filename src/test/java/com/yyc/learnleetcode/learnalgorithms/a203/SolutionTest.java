package com.yyc.learnleetcode.learnalgorithms.a203;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new ListNode(1, new ListNode(2, new ListNode(6,
                new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))),
            6,
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))
        },
        new Object[]{
            null,
            1,
            null
        },
        new Object[]{
            new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7)))),
            7,
            null
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void removeElementsTest(ListNode inputHead, int val, ListNode expected) {
    assertEquals(expected, new Solution().removeElements(inputHead, val));
  }
}