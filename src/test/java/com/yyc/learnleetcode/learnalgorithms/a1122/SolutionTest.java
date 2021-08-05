package com.yyc.learnleetcode.learnalgorithms.a1122;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

  private final Solution solution = new Solution();

  private int[] input1;
  private int[] input2;
  private int[] expect;

  @BeforeEach
  void init() {
    input1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
    input2 = new int[]{2, 1, 4, 3, 9, 6};
    expect = new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
  }

  @Test
  void relativeSortArrayTest() {
    assertArrayEquals(solution.relativeSortArray(input1, input2), expect);
  }

}