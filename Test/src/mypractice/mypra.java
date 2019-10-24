package mypractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class mypra {
public static void main(String[] args) {
 ArrayList<Integer> arr = new Arr().getArr();
 arr.sort(null);
 System.out.println(arr.toString());
 
}
}
class Dui {
	private LinkedList<Object> list=new LinkedList<>();
	public void put(Object o) {
		this.list.addFirst(o);
	}
	public Object get() {
		return this.list.removeLast();
	}
	public boolean isEmpty() {
		return this.list.isEmpty();
	}
}

class Arr{
	public Arr() {
init();
	}
	private ArrayList<Integer> i=new ArrayList<>();
	private void  init() {
		for(int i=10;i>0;i--) {
			this.i.add((int)(Math.random()*101));
		}
	}
	public ArrayList<Integer> getArr(){
		return i;
	}
	
	
}