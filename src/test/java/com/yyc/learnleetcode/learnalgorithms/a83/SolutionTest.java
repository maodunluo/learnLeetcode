package com.yyc.learnleetcode.learnalgorithms.a83;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new ListNode(1, new ListNode(1, new ListNode(2))),
            new ListNode(1, new ListNode(2))
        },
        new Object[]{
            new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))),
            new ListNode(1, new ListNode(2, new ListNode(3)))
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void deleteDuplicatesTest(ListNode input, ListNode expected) {
    assertEquals(expected, new Solution().deleteDuplicates(input));
  }

}