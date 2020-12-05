package com.yyc.learnleetcode.learnalgorithms.a1290;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void getDecimalValue() {
        Solution solution = new Solution();
        ListNode listNode = new ListNode();
        listNode.val = 0;
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(1);
        assertEquals(3,solution.getDecimalValue(listNode));
    }
}