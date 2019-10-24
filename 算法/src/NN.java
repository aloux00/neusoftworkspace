import java.util.Stack;

public class NN {
	public ListNode reverseList(ListNode head) {
		ListNode p=null;
		ListNode phead=null;
		while(head!=null) {
			p=head.next;
			head.next=phead;
			phead=head;
			head=p;
		}
		return phead;

}
	
	public ListNode reverseList2(ListNode head) {
	Stack<ListNode> stack=new Stack();
	while(head!=null) {
		stack.push(head);
		head=head.next;
	}
	ListNode phead=new ListNode();
	ListNode tail=phead;
	
	while(stack.peek()!=null) {
		ListNode node=stack.pop();
	tail.next=node;
	tail=node;
	}
		return phead.next;
	}
}

class ListNode{
	int val;
	ListNode next;
}