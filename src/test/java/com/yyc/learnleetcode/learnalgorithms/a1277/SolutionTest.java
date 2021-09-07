package com.yyc.learnleetcode.learnalgorithms.a1277;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution solution = new Solution();

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}},
            15
        },
        new Object[]{
            new int[][]{{1, 0, 1}, {1, 1, 0}, {1, 1, 0}},
            7
        }
    );
  }


  @ParameterizedTest
  @MethodSource("dataProvider")
  void countSquaresTest(int[][] inputArray, int result) {
    assertEquals(result, solution.countSquares(inputArray));
  }
}