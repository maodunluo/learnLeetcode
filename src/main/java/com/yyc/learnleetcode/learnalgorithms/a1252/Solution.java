package com.yyc.learnleetcode.learnalgorithms.a1252;

/**
 * Cells with Odd Values in a Matrix
 *
 * @author yuechao
 */
public class Solution {
    /**
     * 不只是两次。這種是錯的。
     * 第一次加上数组会生成m + n - 2个奇数
     * 第二次加上数组有如下几种可能，1。行重叠(+ 1 - (m -1) + n)，2。列重叠( + 1 - (n - 1) + m)，3。都重叠（为0），4。都不重叠（-2 + m + n -4）
     *
     * @param n       row
     * @param m       Column
     * @param indices 二维数组
     * @return 计算结果
     */
    @Deprecated
    public int oddCells(int n, int m, int[][] indices) {
        if (indices[0][0] == indices[1][0] && indices[0][1] == indices[1][1]) {
            return 0;
        } else if (indices[0][0] == indices[1][0]) {
            return 2 * n;
        } else if (indices[0][1] == indices[1][1]) {
            return 2 * m;
        } else {
            return 2 * (m + n) - 8;
        }
    }

    /**
     * “异或”运算求的是两个布尔变量的逻辑相异，
     * 当两个变量同为true或者同为false时，运算结果为false；当两个变量一个为true另一个为false时，运算结果为true。
     * Java把符号“^”放在两个布尔变量之间，表示这里进行“异或”运算。
     * 初始化一个boolean数组，其初始值都是false。
     *
     * @param n       row
     * @param m       Column
     * @param indices 二维数组
     * @return 计算结果
     */
    public int oddCells2(int n, int m, int[][] indices) {
        var oddRows = new boolean[n];
        var oddCols = new boolean[m];
        var cntCol = 0;
        var cntRow = 0;
        for (int[] idx : indices) {
            // if row idx[0] appears odd times, it will correspond to true.
            oddRows[idx[0]] ^= true;
            // if column idx[1] appears odd times, it will correspond to true.
            oddCols[idx[1]] ^= true;
        }
        for (boolean r : oddRows) {
            cntRow += r ? 1 : 0;
        }
        for (boolean c : oddCols) {
            cntCol += c ? 1 : 0;
        }
        return (m - cntCol) * cntRow + (n - cntRow) * cntCol;
    }
}
