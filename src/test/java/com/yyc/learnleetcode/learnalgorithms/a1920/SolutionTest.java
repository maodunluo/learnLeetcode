package com.yyc.learnleetcode.learnalgorithms.a1920;

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
            new int[]{0, 2, 1, 5, 3, 4},
            new int[]{0, 1, 2, 4, 5, 3}
        },
        new Object[]{
            new int[]{5, 0, 1, 2, 3, 4},
            new int[]{4, 5, 0, 1, 2, 3}
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void buildArrayTest(int[] inputArray, int[] expectedArray) {
    assertArrayEquals(solution.buildArray(inputArray), expectedArray);
  }
}