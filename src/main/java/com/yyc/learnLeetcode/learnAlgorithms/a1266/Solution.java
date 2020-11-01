package com.yyc.learnLeetcode.learnAlgorithms.a1266;

/**
 * Minimum Time Visiting All Points,统计两个变量之间的纵坐标之差和横坐标之差，取最大的
 * 如何取出二维数组的横坐标和纵坐标。
 *
 * @author yuechao
 */
public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length - 1; i++) {
            result += Math.max(Math.abs(points[i + 1][0] - points[i][0]), Math.abs(points[i+1][1] - points[i][1]));
        }
        return result;
    }
}
