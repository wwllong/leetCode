package primary.list.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import primary.list.ListNode;
import primary.list.RemoveNthFromEnd;

class RemoveNthFromEndTest {

	@Test
	void test() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		RemoveNthFromEnd removeNth =  new RemoveNthFromEnd();
		
//		assertEquals(node2, removeNth.removeNthFromEnd1(node1, 5));
		assertEquals(node1, removeNth.removeNthFromEnd1(node1, 2));
		assertEquals(5, node3.next.val);
	}
	
	@Test
	void test2() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		
		node1.next = node2;
		
		RemoveNthFromEnd removeNth =  new RemoveNthFromEnd();
		
		assertEquals(node1, removeNth.removeNthFromEnd1(node1, 1));
	}


}
