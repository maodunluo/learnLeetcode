package com.yyc.learnleetcode.learnalgorithms.a51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 51. N-Queens
 */
public class Solution {

  List<List<String>> result = new ArrayList<>();

  public List<List<String>> solveNQueens(int n) {

    int [] queens = new int[n];
    backtrack(n, 0, queens);
    return result;
  }

  private void backtrack(int n, int row, int[] queens) {
    if (n == row) {
      result.add(buildBoard(n, queens));
      return;
    }
    for (int col = 0; col < n; col++) {
      if (isvalid(queens, row, col)) {
        queens[row] = col;
        backtrack(n, row + 1, queens);
      }
    }
  }

  private boolean isvalid(int[] queens, int row, int col) {
    for (int i = 0; i < row; i++) {
      // 同列 或 对角线
      if (queens[i] == col || Math.abs(queens[i] - col) == row - i) {
        return false;
      }
    }
    return true;
  }

  private List<String> buildBoard(int n, int[] queens) {
    List<String> resultBoard = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      char[] row = new char[n];
      Arrays.fill(row, '.');
      row[queens[i]] = 'Q';
      resultBoard.add(new String(row));
    }
    return resultBoard;
  }

}
