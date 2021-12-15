package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.domain.ListNode;
import com.wenwl.algorithm.leetcode.easy.DeleteNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteNodeTest {

	ListNode del1 = new ListNode(5);
	ListNode testCase1 = new ListNode(4,
			del1,
			new ListNode(1),
			new ListNode(9));
	ListNode expected1 = new ListNode(4,
			new ListNode(1),
			new ListNode(9));

	ListNode del2 = new ListNode(1);
	ListNode testCase2 = new ListNode(4,
			new ListNode(5),
			del2,
			new ListNode(9));
	ListNode expected2 = new ListNode(4,
			new ListNode(5),
			new ListNode(9));

	ListNode del3 = new ListNode(1);
	ListNode testCase3 = del3.setNextNodes(new ListNode(2),
					new ListNode(3),
					new ListNode(4));
	ListNode expected3 = new ListNode(2,
			new ListNode(3),
			new ListNode(4));

	ListNode del4 = new ListNode(0);
	ListNode testCase4 = del4.setNextNodes(new ListNode(1));
	ListNode expected4 = new ListNode(1);

	ListNode del5 = new ListNode(-3);
	ListNode testCase5 = del5.setNextNodes(new ListNode(5),
			new ListNode(-99));
	ListNode expected5 = new ListNode(5,
			new ListNode(-99));


	@Test
	public void test() {
		DeleteNode.deleteNode(del1);
		assertEquals(expected1.printList(), testCase1.printList());
		DeleteNode.deleteNode(del2);
		assertEquals(expected2.printList(), testCase2.printList());
		DeleteNode.deleteNode(del3);
		assertEquals(expected3.printList(), testCase3.printList());
		DeleteNode.deleteNode(del4);
		assertEquals(expected4.printList(), testCase4.printList());
		DeleteNode.deleteNode(del5);
		assertEquals(expected5.printList(), testCase5.printList());
	}

}
