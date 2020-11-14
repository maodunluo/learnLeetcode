package com.yyc.learnLeetcode.learnAlgorithms.a1450;

/**
 * @author yuechao
 */
public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                result++;
            }
        }
        return result;
    }
}
