package com.yyc.learnleetcode.learnalgorithms.a1828;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[][]{{1, 3}, {3, 3}, {5, 3}, {2, 2}},
            new int[][]{{2, 3, 1}, {4, 3, 1}, {1, 1, 2}},
            new int[]{3, 2, 2}
        },
        new Object[]{
            new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}},
            new int[][]{{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}},
            new int[]{2, 3, 2, 4}
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void countPointsTest(int[][] points, int[][] queries, int[] expected) {
    assertArrayEquals(expected, new Solution().countPoints(points, queries));
  }
}