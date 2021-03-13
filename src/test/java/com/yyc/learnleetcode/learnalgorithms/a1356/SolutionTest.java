package com.yyc.learnleetcode.learnalgorithms.a1356;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8},
            new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7}
        }, new Object[]{
            new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1},
            new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}
        }
    );


  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void sortByBitsTest(int[] inputArray, int[] expectArray) {
    assertArrayEquals(expectArray, new Solution().sortByBits(inputArray));
  }
}