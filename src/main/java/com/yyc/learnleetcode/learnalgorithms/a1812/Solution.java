package com.yyc.learnleetcode.learnalgorithms.a1812;

/**
 * 1812. Determine Color of a Chessboard Square
 *
 * @author yuechao
 */
public class Solution {

  /**
   * character a, in order to distinct row
   */
  private static final Character A = 'a';
  /**
   * integer 2, for mod operator
   */
  private static final int TWO = 2;

  public boolean squareIsWhite(String coordinates) {
    boolean result;
    if((coordinates.charAt(0) - A) % TWO != 1) {
      result = (coordinates.charAt(1) - '1') % TWO == 1;
    } else {
      result = (coordinates.charAt(1) - '1') % TWO != 1;
    }
    return result;
  }
}
