package com.yyc.learnleetcode.learnalgorithms.a234;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))),
            true
        },
        new Object[]{
            new ListNode(1, new ListNode(2)),
            false
        }
    );
  }


  @ParameterizedTest
  @MethodSource("dataProvider")
  void isPalindrome(ListNode input, boolean expected) {
    assertEquals(expected, new Solution().isPalindrome(input));
  }
}