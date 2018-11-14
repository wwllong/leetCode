package primary.list.test;

import static org.junit.Assert.*;

import org.junit.Test;

import primary.list.DeleteNode;
import primary.list.ListNode;

public class DeleteNodeTest {

	@Test
	public void test() {
		ListNode node1 = new ListNode(4);
		ListNode node2 = new ListNode(5);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(9);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		new DeleteNode().deleteNode(node2);
		
		assertEquals(1, node1.next.val);
		
		new DeleteNode().deleteNode(node2);//这个时候，note3的信息已经转义到了2上
		
		assertEquals(9, node1.next.val);

		
	}

}
