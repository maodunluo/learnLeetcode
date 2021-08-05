package com.yyc.learnleetcode.learnalgorithms.a1265;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * how should I test the api?
 */
class SolutionTest {

  private final Solution solution = new Solution();

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[]{1,2,3,4},
            new int[]{4,3,2,1}
        },
        new Object[]{
            new int[]{0,-4,-1,3,-5},
            new int[]{-5,3,-1,-4,0}
        },
        new Object[]{
            new int[]{-2,0,6,4,4,-6},
            new int[]{-6,4,4,6,0,-2}
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void shouldPrintLinkedListInReverse(int[] inputArray, int[] exceptedArray) {
    ImmutableListNode head = new ImmutableListNode() {
      @Override
      public void printValue() {

      }

      @Override
      public ImmutableListNode getNext() {
        return null;
      }
    };
    solution.printLinkedListInReverse(head);
  }

}