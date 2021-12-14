package com.wenwl.algorithm.test.easy;

import static org.junit.Assert.*;

import com.wenwl.algorithm.leetcode.easy.ReverseList;
import org.junit.Test;


public class ReverseListTest {

	ReverseList.ListNode testCase1 = new ReverseList.ListNode(1)
			.setNext(new ReverseList.ListNode(2))
			.setNext(new ReverseList.ListNode(3))
			.setNext(new ReverseList.ListNode(4))
			.setNext(new ReverseList.ListNode(5));
	ReverseList.ListNode expected1 = new ReverseList.ListNode(5)
			.setNext(new ReverseList.ListNode(4))
			.setNext(new ReverseList.ListNode(3))
			.setNext(new ReverseList.ListNode(2))
			.setNext(new ReverseList.ListNode(1));

	ReverseList.ListNode testCase2 = new ReverseList.ListNode(1)
			.setNext(new ReverseList.ListNode(2));
	ReverseList.ListNode expected2 = new ReverseList.ListNode(2)
			.setNext(new ReverseList.ListNode(1));

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
