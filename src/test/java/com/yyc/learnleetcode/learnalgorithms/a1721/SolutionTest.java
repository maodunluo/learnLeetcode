package com.yyc.learnleetcode.learnalgorithms.a1721;

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
            new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5)))))
        },
        new Object[]{
            new ListNode(7,
                new ListNode(9, new ListNode(6, new ListNode(6, new ListNode(7, new ListNode(8,
                    new ListNode(3, new ListNode(0, new ListNode(9, new ListNode(5)))))))))),
            5,
            new ListNode(7,
                new ListNode(9, new ListNode(6, new ListNode(6, new ListNode(8, new ListNode(7,
                    new ListNode(3, new ListNode(0, new ListNode(9, new ListNode(5))))))))))
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void swapNodesTest(ListNode input1, int input2, ListNode expected) {
    assertEquals(expected, new Solution().swapNodes(input1, input2));
  }

}