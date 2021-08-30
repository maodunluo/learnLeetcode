package com.yyc.learnleetcode.learnalgorithms.a1641;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution solution = new Solution();

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            1, 5
        },
        new Object[]{
            2, 15
        },
        new Object[]{
            33, 66045
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void countVowelStringsTest(int input, int expectedResult) {
    assertEquals(expectedResult, solution.countVowelStrings(input));
  }

}