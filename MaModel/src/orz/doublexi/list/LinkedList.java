package orz.doublexi.list;

public class LinkedList implements Collection{
Node head=null;
Node tail=null;
int size=0;
public void add(Object o) {
	Node n=new Node(o,null);
	if(head==null) {
	head=n;
	tail=n;
	size++;
	}else {
tail.next=n;
tail=n;
size++;
	}
}
@Override
public int size() {
	// TODO Auto-generated method stub
	return size;
}
}
