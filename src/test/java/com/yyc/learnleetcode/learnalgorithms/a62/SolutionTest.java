package com.yyc.learnleetcode.learnalgorithms.a62;

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
            3, 7, 28
        },
        new Object[]{
            3, 2, 3
        },
        new Object[]{
            7, 3, 28
        },
        new Object[]{
            3, 3, 6
        }
    );
  }


  @ParameterizedTest
  @MethodSource("dataProvider")
  void uniquePathsTest(int inputOne, int inputTwo, int result) {
    assertEquals(result, solution.uniquePaths(inputOne, inputTwo));
  }

}