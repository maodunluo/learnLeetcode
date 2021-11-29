package com.yyc.learnleetcode.learnalgorithms.a22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void generateParenthesisTest() {
    assertEquals(List.of("()"), new Solution().generateParenthesis(1));
  }
}