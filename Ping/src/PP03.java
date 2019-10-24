import java.util.Queue;

import javax.lang.model.element.QualifiedNameable;

public class PP03 {
public static void main(String[] args) {
	MyQueue<String> myQueue = new MyQueue(10);
	myQueue.insert("String");
	myQueue.insert("String");
	myQueue.insert("String");
	String ss=myQueue.remove();
	System.out.println(ss);
	
}
}
class MyQueue<E>{
	private Object[] queArr;
	private int maxSize;
	private int front;
	private  int  rear;
	private int size;
	public MyQueue(int capacity) {
		maxSize=capacity;
		front =0;
		queArr=new Object[capacity];
		rear=-1;
		size=0;
	}
	public MyQueue() {
		this(10);
	}
	/**
	 * 往队列中插入数据
	 * @param value
	 */
	public void insert(Object value) {
	//判断队列是否满了
		if(isFull()) {
			System.out.println("满了，插入失败");
		}else {
			//如果队列没有满，分为两种情况，一种情况是尾部已经指向queArr的最后一个元素
			//另一种情况是尾部没有指向最后一个元素
			if(rear==maxSize-1) {
				//尾部已经指向queArr的最后一个元素，需要循环回来，指向数组的第一个元素
				rear=-1;
			}
			rear++;
			queArr[rear] =value;
			size++;
			
		}
	
	}
	public E remove() {
		/**
		 * 1队列不能为空
		 * 2如果front指针没有指向内部数组的最后一个元素，直接+1
		 * 3如果front指针没有指向数组的最后一个元素，循环到内部数组的第一个元素
		 * 4队列的实际个数size减1
		 */
/*		int t;
		if(size==0) {
			throw new RuntimeException();
		}
		if(front==maxSize-1) {
			t=queArr[front];
			front=-1;
		}else {
			t=queArr[front];
		}
		front++;
		return t;*/
		Object value=queArr[front];
		if(front==maxSize-1) {
			front=-1;
		}
			
		front ++;
		size--;
		return (E)value;
	}
	public E peek() {
		return (E)queArr[front];
	}
	public boolean isFull() {
		return size==maxSize;
	}
	public boolean isEmpty() {
		return size==0;
	}
}