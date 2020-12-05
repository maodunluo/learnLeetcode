package com.yyc.learnleetcode.learnalgorithms.a1374;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void generateTheStringTest() {
        String expected = "aaab";
        assertEquals(expected, new Solution().generateTheString(4));
    }

    public String generateTheString(int n) {
        StringBuilder builder = new StringBuilder();
        int count = n;
        for(int i =0; i < count; i++) {
            builder.append("a");
        }
        if(count % 2 == 0){
            builder.setCharAt(count - 1, 'b');
        }
        return builder.toString();
    }

}