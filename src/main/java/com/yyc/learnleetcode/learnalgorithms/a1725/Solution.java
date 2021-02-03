package com.yyc.learnleetcode.learnalgorithms.a1725;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 1725. Number Of Rectangles That Can Form The Largest Square
 *
 * @author yuechao
 */
public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        List<Integer> list = new ArrayList<>();
        for (int[] rectangle : rectangles) {
            int min = Math.min(rectangle[0], rectangle[1]);
            list.add(min);
        }
        list.sort(Comparator.comparingInt(o -> o));
        return (int) list.stream().filter(i -> i.equals(list.get(list.size() - 1))).count();
    }
}
