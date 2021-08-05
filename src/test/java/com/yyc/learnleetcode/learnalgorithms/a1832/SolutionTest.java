package com.yyc.learnleetcode.learnalgorithms.a1832;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void checkIfPangramTest() {
    assertTrue(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    assertFalse(solution.checkIfPangram("leetcode"));
  }

}