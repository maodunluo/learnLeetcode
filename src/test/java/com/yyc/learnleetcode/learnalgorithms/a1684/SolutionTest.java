package com.yyc.learnleetcode.learnalgorithms.a1684;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    @DisplayName("example1")
    void countConsistentStringsWithExample1() {
        assertEquals(7, new Solution().countConsistentStrings("abc", new String[] {"a","b","c","ab","ac","bc","abc"}));
    }

    @Test
    @DisplayName("examole2")
    void countConsistentStringsWIthExample2() {
        assertEquals(2, new Solution().countConsistentStrings("ab", new String[] {"ad","bd","aaab","baa","badab"}));
    }

}