package com.yyc.learnleetcode.learnalgorithms.a20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution solution = new Solution();

  public static Collection<Object[]> dataProvider() {
     return List.of(
         new Object[]{
             "()",
             true
         },
         new Object[]{
             "()[]{}",
             true
         },
         new Object[]{
             "(]",
             false
         },
         new Object[]{
             "([)]",
             false
         },
         new Object[]{
             "{[]}",
             true
         }
     );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void isValidTest(String inputString, boolean expectedResult) {
    assertEquals(expectedResult, solution.isValid(inputString));
  }

}