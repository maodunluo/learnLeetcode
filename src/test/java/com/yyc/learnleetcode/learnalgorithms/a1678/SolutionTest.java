package com.yyc.learnleetcode.learnalgorithms.a1678;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    @DisplayName("空字符串")
    void interpretWithEmpty() {
        assertEquals("", new Solution().interpret(""));
    }

    @Test
    @DisplayName("example1")
    void interpretWithExample1() {
        assertEquals("Goal", new Solution().interpret("G()(al)"));
    }

    @Test
    @DisplayName("example2")
    void interpretWithExample2() {
        assertEquals("Gooooal", new Solution().interpret("G()()()()(al)"));
    }

    @Test
    @DisplayName("example3")
    void interpretWithExample3() {
        assertEquals("alGalooG", new Solution().interpret("(al)G(al)()()G"));
    }
}