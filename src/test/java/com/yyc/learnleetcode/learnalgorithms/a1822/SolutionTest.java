package com.yyc.learnleetcode.learnalgorithms.a1822;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution solution = new Solution();

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[]{-1, -2, -3, -4, 3, 2, 1},
            1
        },
        new Object[]{
            new int[]{1, 5, 0, 2, -3},
            0
        },
        new Object[]{
            new int[]{-1, 1, -1, 1, -1},
            -1
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void arraySignTest(int[] input, int expect) {
    assertThat(solution.arraySign(input)).isEqualTo(expect);
  }

}