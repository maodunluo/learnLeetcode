package com.yyc.learnleetcode.learnalgorithms.a1929;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution solution = new Solution();

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[]{1, 2, 1},
            new int[]{1, 2, 1, 1, 2, 1}
        },
        new Object[]{
            new int[]{1, 3, 2, 1},
            new int[]{1, 3, 2, 1, 1, 3, 2, 1}
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void getConcatenationTest(int[] inputArray, int[] expectedArray) {
    assertArrayEquals(expectedArray, solution.getConcatenation(inputArray));
  }

}