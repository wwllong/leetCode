package com.wenwl.algorithm.leetcode.easy;

import com.wenwl.algorithm.leetcode.domain.ListNode;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/reverse-linked-list/">Q206-反转链表</a>
 */
public class ReverseList {

	/**
	 * m2(0ms): 递归方法
	 */
	public static ListNode reverseList2(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode node = reverseList2(head.next);
		head.next.next = head;
		head.next = null;
		return node;
	}

	/**
	 * m2(0ms): 迭代方法
	 */
	public static ListNode reverseList1(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode node = null;
		while(head != null) {
			ListNode temp = head.next;
			head.next = node;
			node = head;
			head = temp;
		}
        return node;
    }

}


