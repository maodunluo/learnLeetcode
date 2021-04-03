package com.yyc.learnleetcode.learnalgorithms.a876;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private Solution solution;

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
            new ListNode(3)
        },
        new Object[]{
            new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))),
            new ListNode(4)
        }
    );
  }

  @BeforeEach
  void setUp() {
    solution = new Solution();
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void shouldReturnNode3(ListNode input, ListNode expect) {
    assertThat(solution.middleNode(input).val).isSameAs(expect.val);
  }
}