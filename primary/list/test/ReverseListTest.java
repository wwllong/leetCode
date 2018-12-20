package primary.list.test;

import static org.junit.Assert.*;

import org.junit.Test;

import primary.list.DeleteNode;
import primary.list.ListNode;
import primary.list.ReverseList;

public class ReverseListTest {

	@Test
	public void test() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		
		ReverseList reverseList = new ReverseList();
		String str1 = reverseList.printList(node1);
		
		node1 = reverseList.reverseList1(node1);
		String str2 = reverseList.printList(node1);

		node1 = reverseList.reverseList2(node1);
		String str3 = reverseList.printList(node1);
		
		assertEquals("4321",str2 );
		assertEquals(str1,str3 );
				
	}

}
