package com.yyc.learnleetcode.learnalgorithms.a1441;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[]{1, 3},
            3,
            List.of("Push", "Push", "Pop", "Push")
        },
        new Object[]{
            new int[]{1, 2, 3},
            3,
            List.of("Push", "Push", "Push")
        },
        new Object[]{
            new int[]{1, 2},
            4,
            List.of("Push", "Push")
        },
        new Object[]{
            new int[]{2, 3, 4},
            4,
            List.of("Push", "Pop", "Push", "Push", "Push")
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void buildArrayTest(int[] inputArray, int n, List<String> expectList) {
    assertEquals(expectList, new Solution().buildArray(inputArray, n));
  }
}