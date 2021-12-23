package com.wenwl.algorithm.test.medium;

import static org.junit.Assert.assertEquals;

import com.wenwl.algorithm.leetcode.domain.ListNode;
import com.wenwl.algorithm.leetcode.medium.RemoveNthFromEnd;
import org.junit.Test;

public class RemoveNthFromEndTest {

	private RemoveNthFromEnd removeNthFromEnd =  new RemoveNthFromEnd();

	private ListNode head1 = new ListNode(1,
			new ListNode(2),
			new ListNode(3),
			new ListNode(4),
			new ListNode(5)
	);
	private ListNode expected1 = new ListNode(1,
			new ListNode(2),
			new ListNode(3),
			new ListNode(5)
	);

	private ListNode head2 = new ListNode(1);
	private ListNode expected2 = null;

	private ListNode head3 = new ListNode(1, new ListNode(2));
	private ListNode expected3 = new ListNode(1);

	@Test
	public void test3() {
		assertEquals(expected1.printList(), removeNthFromEnd.removeNthFromEnd3(head1, 2).printList());
		assertEquals(expected2, removeNthFromEnd.removeNthFromEnd3(head2, 1));
		assertEquals(expected3.printList(), removeNthFromEnd.removeNthFromEnd3(head3, 1).printList());
	}

	@Test
	public void test2() {
		assertEquals(expected1.printList(), removeNthFromEnd.removeNthFromEnd2(head1, 2).printList());
		assertEquals(expected2, removeNthFromEnd.removeNthFromEnd2(head2, 1));
		assertEquals(expected3.printList(), removeNthFromEnd.removeNthFromEnd2(head3, 1).printList());
	}


	@Test
	public void test1() {
		assertEquals(expected1.printList(), removeNthFromEnd.removeNthFromEnd1(head1, 2).printList());
		assertEquals(expected2, removeNthFromEnd.removeNthFromEnd1(head2, 1));
		assertEquals(expected3.printList(), removeNthFromEnd.removeNthFromEnd1(head3, 1).printList());
	}

}
