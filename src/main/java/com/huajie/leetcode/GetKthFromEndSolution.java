package com.huajie.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 * <p>
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * 返回链表 4->5.
 *
 * @author ：xwf
 * @date ：Created in 2020\7\21 0021 22:29
 */
public class GetKthFromEndSolution {

    /**
     * 空间换时间
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        List<ListNode> nodes = new ArrayList<>();
        while (true) {
            nodes.add(head);
            if (head.next == null) {
                break;
            }
            head = head.next;
        }
        return nodes.get(nodes.size()-k);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
