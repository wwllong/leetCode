package com.wenwl.algorithm.leetcode.easy;

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

	public static class ListNode {

		int val;
		ListNode next;

		public ListNode(){}

		public ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		public ListNode setNext(ListNode next) {
			this.next = next;
			return this;
		}

		public String printList() {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(this.val);
			ListNode next = this.next;
			while(next != null) {
				stringBuilder.append(next.val);
				next = next.next;
			}
			return stringBuilder.toString();
		}
	}

}


