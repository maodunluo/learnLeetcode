package com.yyc.learnleetcode.learnalgorithms.a883;

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
            new int[][]{{1, 2}, {3, 4}},
            17
        },
        new Object[]{
            new int[][]{{2}},
            5
        },
        new Object[]{
            new int[][]{{1, 0}, {0, 2}},
            8
        },
        new Object[]{
            new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}},
            14
        },
        new Object[]{
            new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}},
            21
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void projectionAreaTest(int[][] input, int expect) {
    assertThat(solution.projectionArea(input)).isEqualTo(expect);
  }

}