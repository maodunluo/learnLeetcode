package com.yyc.learnleetcode.learnalgorithms.a728;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    List<Integer> expected = new LinkedList<>();

    @BeforeEach
    void initList() {
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(11);
        expected.add(12);
        expected.add(15);
        expected.add(22);
    }

    @Test
    void selfDividingNumbers() {
        assertEquals(expected, new Solution().selfDividingNumbers(1, 22));

    }
}