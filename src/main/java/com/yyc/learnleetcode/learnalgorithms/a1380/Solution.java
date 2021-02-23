package com.yyc.learnleetcode.learnalgorithms.a1380;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 1380. Lucky Numbers in a Matrix
 *
 * @author yuechao
 */
public class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int[] ints : matrix) {
            int min = ints[0];
            for (int anInt : ints) {
                if (min > anInt) {
                    min = anInt;
                }
            }
            list.add(min);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            for (int[] ints : matrix) {
                if (max < ints[i]) {
                    max = ints[i];
                }
            }
            list.add(max);
        }
        list.sort(Comparator.comparingInt(integer -> integer));
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                return List.of(list.get(i));
            }
        }
        return new ArrayList<>();
    }
}
