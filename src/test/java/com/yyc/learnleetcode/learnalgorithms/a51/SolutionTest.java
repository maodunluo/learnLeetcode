package com.yyc.learnleetcode.learnalgorithms.a51;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private Solution solutionUnderTest;

  @BeforeEach
  void setUp() {
    solutionUnderTest = new Solution();
  }


  @Test
  void testSolveNQueens() {
    final List<List<String>> lists = Arrays.asList(
        Arrays.asList(".Q..", "...Q", "Q...", "..Q."),
        Arrays.asList("..Q.", "Q...", "...Q", ".Q..")
    );
    assertThat(solutionUnderTest.solveNQueens(4)).isEqualTo(lists);
  }
}
