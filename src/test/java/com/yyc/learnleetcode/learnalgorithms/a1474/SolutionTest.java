package com.yyc.learnleetcode.learnalgorithms.a1474;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    ListNode listNode13 = new ListNode(13);
    ListNode listNode12 = new ListNode(12, listNode13);
    ListNode listNode11 = new ListNode(11, listNode12);
    ListNode listNode10 = new ListNode(10, listNode11);
    ListNode listNode9 = new ListNode(9, listNode10);
    ListNode listNode8 = new ListNode(8, listNode9);
    ListNode listNode7 = new ListNode(7, listNode8);
    ListNode listNode6 = new ListNode(6, listNode7);
    ListNode listNode5 = new ListNode(5, listNode6);
    ListNode listNode4 = new ListNode(4, listNode5);
    ListNode listNode3 = new ListNode(3, listNode4);
    ListNode listNode2 = new ListNode(2, listNode3);
    ListNode listNode1 = new ListNode(1, listNode2);

    ListNode listNode12deleted = new ListNode(12);
    ListNode listNode11deleted = new ListNode(11, listNode12deleted);
    ListNode listNode7deleted = new ListNode(7, listNode11deleted);
    ListNode listNode6deleted = new ListNode(6, listNode7deleted);
    ListNode listNode2deleted = new ListNode(2, listNode6deleted);
    ListNode listNode1deleted = new ListNode(1, listNode2deleted);

    @Test
    void deleteNodes() {
        assertEquals(listNode1deleted, new Solution().deleteNodes(listNode1, 2, 3));
        //在这下面使用listNode1就会发现listNode1已经改变了，如果我想在这底下多次调用就有问题了
        System.out.println(listNode1);
    }

    @Test
    void safeDeleteNodes() {
        assertEquals(listNode1deleted, new Solution().safeDeleteNodes(listNode1, 2, 3));
        System.out.println(listNode1);
    }
}