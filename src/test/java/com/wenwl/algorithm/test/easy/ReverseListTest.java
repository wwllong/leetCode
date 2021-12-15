package com.wenwl.algorithm.test.easy;

import static org.junit.Assert.*;

import com.wenwl.algorithm.leetcode.domain.ListNode;
import com.wenwl.algorithm.leetcode.easy.ReverseList;
import org.junit.Test;


public class ReverseListTest {

	ListNode testCase1 = new ListNode(1,
			new ListNode(2),
			new ListNode(3),
			new ListNode(4),
			new ListNode(5));
	ListNode expected1 = new ListNode(5,
			new ListNode(4),
			new ListNode(3),
			new ListNode(2),
			new ListNode(1));

	ListNode testCase2 = new ListNode(1, new ListNode(2));
	ListNode expected2 = new ListNode(2, new ListNode(1));

	@Test
	public void test2() {
		assertEquals(expected1.printList(), ReverseList.reverseList2(testCase1).printList());
		assertEquals(expected2.printList(), ReverseList.reverseList2(testCase2).printList());
	}

	@Test
	public void test1() {
		assertEquals(expected1.printList(), ReverseList.reverseList1(testCase1).printList());
		assertEquals(expected2.printList(), ReverseList.reverseList1(testCase2).printList());
	}

}
