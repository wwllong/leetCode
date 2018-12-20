package primary.list;

/**
 * @author Wwl
 * 迭代或递归地反转链表
 */
public class ReverseList {
	
	//普通实现-将结点从前到后依次放到表头
	public ListNode reverseList1(ListNode head) {
		if(head==null || head.next==null) {
			return head;
		}
		
		ListNode p = null;
		while(head!=null) {
			ListNode temp = head.next;
			head.next = p;
			p = head;
			head = temp;
		}
		
        return p;
    }
	
	//递归实现
	public ListNode reverseList2(ListNode head) {
		if(head==null || head.next==null) {
			return head;
		}
		
		ListNode p = reverseList2(head.next);
		head.next.next = head;
		head.next = null;//避免1、2结点闭环
		
        return p;
    }
	
	public String printList(ListNode head) {
		String str = head.val+"";
		ListNode node = head.next;
		while(node!=null) {
			str += (node.val+"");
			node = node.next;
		}
		return str;
	}
}
