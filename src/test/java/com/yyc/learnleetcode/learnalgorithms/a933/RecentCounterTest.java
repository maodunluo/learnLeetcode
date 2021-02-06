package com.yyc.learnleetcode.learnalgorithms.a933;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecentCounterTest {

    @Test
    void testPing() {
        RecentCounter obj = new RecentCounter();
         assertEquals(1, obj.ping(1));
         assertEquals(2, obj.ping(100));
         assertEquals(3, obj.ping(3001));
         assertEquals(3, obj.ping(3002));
    }
}