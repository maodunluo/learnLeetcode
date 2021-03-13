package com.yyc.learnleetcode.learnalgorithms.a246;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            "69",
            true
        },
        new Object[]{
            "88",
            true
        },
        new Object[]{
            "962",
            false
        },
        new Object[]{
            "1",
            true
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void isStrobogrammaticTest(String input, boolean expect) {
    assertEquals(expect, new Solution().isStrobogrammatic(input));
  }
}