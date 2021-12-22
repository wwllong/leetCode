package com.wenwl.algorithm.leetcode.medium;

import com.wenwl.algorithm.leetcode.domain.ListNode;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/">Q19-删除链表的倒数第 N 个结点</a>
 */
public class RemoveNthFromEnd {

	/**
	 * m2(0ms,208tc): 在m1的基础上改进，一趟扫描实现
	 */
	public ListNode removeNthFromEnd2(ListNode head, int n) {
		return null;
	}

	/**
	 * m1(0ms,208tc): 先统计长度，后定位到删除节点Pre节点，进行删除操作
	 */
	public ListNode removeNthFromEnd1(ListNode head, int n) {
		ListNode node = head;
		// 统计长度
		int length = 1;
		while(node.next != null)  {
			length++;
			node = node.next;
		}

		if (n == length) {
			node = head.next;
		}else {
			node = head;
			// 寻找要删除的节点上一个节点
			ListNode delNodePre = head;
			int x = 1;
			while(x < length - n) {
				delNodePre = delNodePre.next;
				x++;
			}
			if(delNodePre.next == null) {
				delNodePre = null;
			}else {
				delNodePre.next = delNodePre.next.next;
			}
		}
		return node;
	}

}
