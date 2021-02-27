package com.yyc.learnleetcode.learnalgorithms.a344;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[] {
            new char[]{'h','e','l','l','o'},
            new char[]{'o','l','l','e','h'}
        },
        new Object[] {
            new char[]{'H','a','n','n','a','h'},
            new char[]{'h','a','n','n','a','H'}
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void reverseString(char[] inputArr, char[] expectArr) {
    assertArrayEquals(expectArr, new Solution().reverseString(inputArr));
  }
}