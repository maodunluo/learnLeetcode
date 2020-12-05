package com.yyc.learnleetcode.learnalgorithms.a1431;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("Kids With the Greatest Number of Candies")
    void kidsWithCandies() {
        //init array
        int[] initArray = {12, 1, 12};
        int extra = 10;
        List<Boolean> excepted = new ArrayList<>();
        excepted.add(true);
        excepted.add(false);
        excepted.add(true);

        Solution solution = new Solution();
        final long start = System.currentTimeMillis();
        final List<Boolean> actual = solution.kidsWithCandies(initArray, extra);
        final long end = System.currentTimeMillis();
        System.out.println("for loop spending time：" + (end - start));
        assertEquals(excepted, actual);

        final long start2 = System.currentTimeMillis();
        final List<Boolean> actual2 = solution.kidsWithCandiesWithStream(initArray, extra);
        final long end2 = System.currentTimeMillis();
        System.out.println("stream spending time：" + (end2 - start2));
        assertEquals(excepted, actual2);
    }
}