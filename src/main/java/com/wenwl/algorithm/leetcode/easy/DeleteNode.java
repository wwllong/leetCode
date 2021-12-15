package com.wenwl.algorithm.leetcode.easy;

import com.wenwl.algorithm.leetcode.domain.ListNode;

/**
 * @author wenl
 * @see <a href="https://leetcode-cn.com/problems/delete-node-in-a-linked-list/">Q237-删除链表中的节点</a>
 */
public class DeleteNode {

	/**
	 * m1(0ms)
	 */
	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

}


