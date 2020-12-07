package com.yyc.learnleetcode.learnalgorithms.a1474;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.SerializationUtils;

/**
 * @author yuechao
 */
public class Solution {

    /**
     * 这种方法可以安全的操作head，通过对head的deep copy, 执行完方法后不会对head有影响。
     *
     * @param head 头节点
     * @param m    保留的位数
     * @param n    删除的个数
     * @return 处理后的链表
     */
    public ListNode safeDeleteNodes(ListNode head, int m, int n) {
        ListNode result = SerializationUtils.clone(head);
        ListNode cur = result;
        ListNode pre = null;
        while (cur != null) {
            int i = m;
            int j = n;
            while (cur != null && i-- > 0) {
                pre = cur;
                cur = cur.next;
            }
            while (cur != null && j-- > 0) {
                cur = cur.next;
            }
            if (pre != null) {
                pre.next = cur;
            }
        }
        return result;
    }

    /**
     * 这种方法可以安全的操作head，通过对head的deep copy, 执行完方法后不会对head有影响。
     *
     * @param head 头节点
     * @param m    保留的位数
     * @param n    删除的个数
     * @return 处理后的链表
     */
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            int i = m;
            int j = n;
            while (cur != null && i-- > 0) {
                pre = cur;
                cur = cur.next;
            }
            while (cur != null && j-- > 0) {
                cur = cur.next;
            }
            if (pre != null) {
                pre.next = cur;
            }
        }
        return head;
    }
}
