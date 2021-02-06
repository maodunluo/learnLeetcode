package com.yyc.learnleetcode.learnalgorithms.a359;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoggerTest {

    @Test
    void shouldPrintMessageTest() {
        Logger obj = new Logger();
        assertTrue(obj.shouldPrintMessage(1, "foo"));
        assertTrue(obj.shouldPrintMessage(2, "bar"));
        assertFalse(obj.shouldPrintMessage(3, "foo"));
        assertFalse(obj.shouldPrintMessage(8, "bar"));
        assertFalse(obj.shouldPrintMessage(10, "foo"));
        assertTrue(obj.shouldPrintMessage(11, "foo"));
    }
}