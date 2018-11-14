package primary.list;

/**
 * @author Wwl
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点s(给定的 n 保证是有效的。)
 */
public class RemoveNthFromEnd {
	
	public ListNode removeNthFromEnd1(ListNode head,int n) {
		
		ListNode s = head;
		
		int length = 1;
		while(s.next!=null)  {
			length++;
			s = s.next;
		}
		
		if(n==length) {
			s=head.next;
		}else {
			s = head;
			//找到要删除的节点
			ListNode delNode = head;
			int x = 1;
			while(x<length-n) {
				delNode = delNode.next;
				++x;
			}
			//删除
			if(delNode.next!=null) {
				delNode.next = delNode.next.next;
			}else {//删除的节点为末尾节点
				delNode = null;
			}
		}
		
		return s;
	}
}
