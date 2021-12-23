package com.wenwl.algorithm.leetcode.medium;

import com.wenwl.algorithm.leetcode.domain.ListNode;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/">Q19-删除链表的倒数第 N 个结点</a>
 */
public class RemoveNthFromEnd {

	/**
	 * m3(0ms,208tc): 快慢指针, 慢指针找到倒数第n + 1个节点（涉及链表特殊位置，要定位到删除节点的前驱）
	 * - 慢指针指向dummy节点（方便定位到删除节点的前驱），快指针指向head并先行 n 步
	 * - 同时移动快慢指针，直到快指针走到尾部（等于null），此时慢指针指向倒数 n + 1
	 * - 最后删除慢指针指向节点的后继。
	 * 时间复杂度：O(n)
	 */
	public ListNode removeNthFromEnd3(ListNode head, int n) {
		ListNode dummy = new ListNode(0, head);
		ListNode first = head, second = dummy;
		for (int i = 0; i < n; ++i) {
			first = first.next;
		}
		while (first != null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		return dummy.next;
	}

	/**
	 * m2(0ms,208tc): 在m1的基础上改进代码
	 * - 使用一个dummy节点，便于返回head，以及定位delPreNode、减少m1中的很多不必要判断
	 * - 计算链表长度
	 * - 删除倒数第n个节点 = 删除从列表开头算起的的（L - n + 1）个节点。
	 * 整体时间复杂度：O(n)
	 */
	public ListNode removeNthFromEnd2(ListNode head, int n) {
		ListNode dummy = new ListNode(0, head);
		int length = getLength(head);
		ListNode cur = dummy;
		for (int i = 1; i < length - n + 1; ++i) {
			cur = cur.next;
		}
		cur.next = cur.next.next;
		return dummy.next;
	}

	public int getLength(ListNode head) {
		int length = 0;
		while (head != null) {
			++length;
			head = head.next;
		}
		return length;
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
