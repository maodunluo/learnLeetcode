package com.yyc.learnleetcode.learnalgorithms.a1662;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    String[] words1 = new String[2];
    String[] words2 = new String[2];

    @BeforeEach
    void initArrays() {
        words1[0] = "ab";
        words1[1] = "c";

        words2[0] = "a";
        words2[1] = "bc";
    }

    @BeforeEach
    void initStringBuilder() {

    }

    @AfterEach
    void clearArrays() {
        words1 = null;
        words2 = null;
    }

    @Test
    void arrayStringsAreEqual() {
        assertEquals(String.join("", words1), String.join("", words2));
    }

    @Test
    void stringJoinTest() {
        String word1ByJoin = String.join("", words1);
        String word2ByJoin = String.join("", words2);
        assertEquals(word1ByJoin, word2ByJoin);
    }

    @Test
    void StringBufferAppend() {
        assertEquals(convertArrayToString(words1), convertArrayToString(words2));
    }

    String convertArrayToString(String[] arr) {
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }
        return result.toString();
    }

    @Test
    void arrayStringsAreEqualTest() {
        assertTrue(new Solution().arrayStringsAreEqual(words1, words2));
    }

    @Test
    void arrayStringsAreEqualByStringBuilder() {
        assertTrue(new Solution().arrayStringsAreEqualByStringBuilder(words1, words2));
    }



}