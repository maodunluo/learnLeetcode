package com.yyc.learnleetcode.learnalgorithms.a811;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.CollectionUtils;

class SolutionTest {

    String[] inputArray = new String[1000];
    List<String> resultList = new ArrayList<>();

    @BeforeEach
    void init() {
        inputArray = new String[]{"9001 discuss.leetcode.com"};
        resultList.add("9001 com");
        resultList.add("9001 discuss.leetcode.com");
        resultList.add("9001 leetcode.com");
    }


    @Test
    @DisplayName("Instance 1")
    void subdomainVisitsTest() {
        assertEquals(resultList, new Solution().subdomainVisits(inputArray));
    }
}