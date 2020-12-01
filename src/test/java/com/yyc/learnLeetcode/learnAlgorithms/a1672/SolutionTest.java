package com.yyc.learnLeetcode.learnAlgorithms.a1672;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maximumWealth() {
        int[][] accounts = new int[][]{{1,2,3},{3,2,1}};
        assertEquals(6, Arrays.stream(accounts).mapToInt(arr -> Arrays.stream(arr).sum()).max().getAsInt());
    }

    @Test
    void maximumWealthTest() {
        int[][] accounts = new int[][]{{1,2,3},{3,2,1}};
        assertEquals(6, new Solution().maximumWealth(accounts));
    }
}