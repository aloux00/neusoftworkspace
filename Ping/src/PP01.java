import java.util.Arrays;
import java.util.Stack;

public class PP01 {
	public static void main(String[] args) {
String[] s= {"hah","hh"};
String[] copyOf = Arrays.copyOf(s, 3);
System.out.println(Arrays.toString(s));
System.out.println(Arrays.toString(copyOf));
	}
}

class MyStack{
	private Object[] arr;
	private int capacity;
	private static int  DEFAULT_NUM=10;
	private int top;
	public MyStack(int capacity) {
		this.capacity=capacity;
		arr=new Object[capacity];
		top=-1;
		
	}
	public MyStack() {
		this(DEFAULT_NUM);
	}
	public int getNum() {
		return top+1;
	}
	public void push(int value) {
		if(top<capacity-1) {
			top++;
			arr[top]=value;
		}else {
			kuo();
			push(value);
		}
	}
	private void kuo() {
		this.capacity=capacity+(capacity>>1);
		Arrays.copyOf(arr, capacity);
	}
	public Object pop() {
		Object i=arr[top];
		top--;
		return i;
	}

	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==capacity-1;
	}
	public boolean isFull01() {
		return top==capacity-1;
	}
	public Object peek() {
		if(isEmpty()) {
			throw new RuntimeException("栈为空");
		}
		return arr[top];
	}
}
