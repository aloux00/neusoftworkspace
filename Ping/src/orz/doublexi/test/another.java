package orz.doublexi.test;


public class another {

}

class DoubleLink {
Node head=new Node(null,null,null);
Node tail=head;
int size=0;
public void addHead(Object o) {
	
	Node linshi=new Node(head,o,tail);
	head.next=linshi;
	size++;
}
public void addTail(Object o) {
	Node linshi=new Node(tail.pre,o,tail);
	tail.pre=linshi;
	size++;
}

}

class Node{
	  Node pre;
	  Object data;
	  Node next;
	 public Node(Node pre,Object data,Node next) {
		 this.pre=pre;
		 this.data=data;
		 this.next=next;
	 }
//	 public Node next() {
//		 return next;
//	 }
//	 public Node pre() {
//		 return pre;
//	 }
 }