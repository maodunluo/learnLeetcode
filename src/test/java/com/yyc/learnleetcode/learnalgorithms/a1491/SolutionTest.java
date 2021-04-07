package com.yyc.learnleetcode.learnalgorithms.a1491;

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
            new int[]{4000, 3000, 1000, 2000},
            2500.00000
        },
        new Object[]{
            new int[]{1000, 2000, 3000},
            2000.00000
        },
        new Object[]{
            new int[]{6000, 5000, 4000, 3000, 2000, 1000},
            3500.00000
        },
        new Object[]{
            new int[]{8000, 9000, 2000, 3000, 6000, 1000},
            4750.00000
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void averageTest(int[] inputArray, double expect) {
    assertThat(solution.average(inputArray)).isEqualTo(expect);
  }

}