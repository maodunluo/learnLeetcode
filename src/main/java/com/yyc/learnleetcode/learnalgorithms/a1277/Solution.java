package com.yyc.learnleetcode.learnalgorithms.a1277;

/**
 * Count Square Submatrices with All Ones
 *
 * @author yuechao
 */
public class Solution {

  public int countSquares(int[][] matrix) {
    int squareCount = 0;

    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[i].length; j++){
        if(i == 0 || j == 0){
          squareCount += matrix[i][j];
          continue;
        }
        if(matrix[i][j] == 1){
          matrix[i][j] = Math.min(Math.min(matrix[i-1][j], matrix[i][j-1]), matrix[i-1][j-1])+1;
          squareCount += matrix[i][j];
        }
      }
    }
    return squareCount;
  }
}
