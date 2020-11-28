package com.yyc.learnLeetcode.learnAlgorithms.a1304;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sumZero() {
        int n = 5;
        int[] result = new int[n];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            result[i] = i + 1;
            sum+=result[i];
        }
        result[n - 1] = -sum;
        System.out.println(Arrays.toString(result));
    }
}