package com.yyc.learnleetcode.learnalgorithms.a23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new ListNode[]{new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))},
            new ListNode(1,
                new ListNode(1,
                    new ListNode(2,
                        new ListNode(3,
                            new ListNode(4,
                                new ListNode(4,
                                    new ListNode(5,
                                        new ListNode(6))))))))
        },
        new Object[]{
            null,
            null
        },
        new Object[]{
            new ListNode[]{null},
            null
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void mergeKLists1Test(ListNode[] input, ListNode expected) {
    assertEquals(expected, new Solution().mergeKLists(input));
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void mergeKLists2Test(ListNode[] input, ListNode expected) {
    assertEquals(expected, new Solution().mergeKLists2(input));
  }


}