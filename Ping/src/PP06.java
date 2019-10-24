import java.util.LinkedList;

public class PP06 {

}
class MyList{
	Node2 head;
	Node2 tail;
	public  MyList() {
		head=new Node2(null, 0, null);
		tail=new Node2(head, 0, null);
		head.next=tail;
	}
	public void  addFirst(int i) {
		new Node2(head,i,head.next);
		head=new Node2(null,i,head);
		head.next.pre=head;
	}
	public void  addLast(int i) {
		head=new Node2(null,i,head);
	}
}
class Node2  {
	Node2 pre;
	int i;
	Node2 next;
public Node2(Node2 pre,int i,Node2 next) {
	this.pre=pre;
	this.next=next;
	this.i=i;
}
}
