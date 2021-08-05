package com.yyc.learnleetcode.learnalgorithms.a1827;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution solution = new Solution();

  private static List<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[]{1, 1, 1},
            3
        },
        new Object[]{
            new int[]{1, 5, 2, 4, 1},
            14
        },
        new Object[]{
            new int[]{8},
            0
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void minOperationsTest(int[] input, int expect) {
    assertThat(solution.minOperations(input)).isEqualTo(expect);
  }

}