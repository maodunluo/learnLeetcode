package com.yyc.learnleetcode.learnalgorithms.a215;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private Solution solutionUnderTest;

  @BeforeEach
  void setUp() {
    solutionUnderTest = new Solution();
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void testFindKthLargest(int[] input1, int input2, int expected) {
    assertThat(solutionUnderTest.findKthLargest(input1, input2)).isEqualTo(expected);
  }

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[]{3, 2, 1, 5, 6, 4}, 2,
            5
        },
        new Object[]{
            new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4,
            4
        }
    );
  }
}
