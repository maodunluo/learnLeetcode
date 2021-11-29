package com.yyc.learnleetcode.learnalgorithms.a448;

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
            new int[]{4, 3, 2, 7, 8, 2, 3, 1},
            List.of(5, 6)
        },
        new Object[]{
            new int[]{1, 1},
            List.of(2)
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void findDisappearedNumbersTest(int[] inputArray, List<Integer> expectedList) {
    assertEquals(expectedList, solution.findDisappearedNumbers(inputArray));
  }
}