package com.yyc.learnleetcode.learnalgorithms.a1290;

/**
 * Convert Binary Number in a Linked List to Integer
 *
 * @author yuechao
 */
public class Solution {
    public int getDecimalValue(ListNode head) {
        //如何不用确定位数，直接往左位移就可以。
        int result = head.val;
        while (head.next != null) {
            result = result<<1;
            result += head.next.val;
            head = head.next;
        }
        return result;
    }
}
