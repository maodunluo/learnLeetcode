package com.yyc.learnleetcode.learnalgorithms.a346;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovingAverageTest {

    @Test
    void next() {
        MovingAverage movingAverage = new MovingAverage(3);
        assertEquals(1, movingAverage.next(1));
        assertEquals(5.5, movingAverage.next(10));
        assertEquals((1.0 + 10 + 3) / 3, movingAverage.next(3));
        assertEquals(6, movingAverage.next(5));
    }
}