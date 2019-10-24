package 快排;


import java.util.Arrays;

public class test {
public static void main(String[] args) {
	MyList myList = new MyList(5);
	for(int i=0;i<6;i++) {
		myList.add("haha"+i);
	}
	myList.remove(0);
	myList.add("eee");
	System.out.println(myList.toString());
}
}

class MyList{
	private String [] list ;
	private boolean[] isInsert;

	public MyList(int i) {
		list=new String [i];
		isInsert=new boolean[i];
	}
	public void add(String t) {
for(int i=0;i<isInsert.length;i++) {
	if(!isInsert[i]) {
		list[i]=t;
		isInsert[i]=true;
		System.out.println("add one");
		return;
	}
if(i>=list.length-1) {
	System.out.println("����");
}
}
	}
	public String remove(int num) {
		if(isInsert[num]) {
			String s=list[num];
			list[num]=null;
			isInsert[num]=false;
			return s;
		}
		return null;
	}
@Override
public String toString() {
	return Arrays.toString(list);
}
	
}
