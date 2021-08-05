package com.yyc.learnleetcode.learnalgorithms.a1196;

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
            new int[]{100, 200, 150, 1000},
            4
        },
        new Object[]{
            new int[]{900, 950, 800, 1000, 700, 800},
            5
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void maxNumberOfApplesTest(int[] input, int expect) {
    assertThat(solution.maxNumberOfApples(input)).isEqualTo(expect);
  }

}