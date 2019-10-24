import java.util.concurrent.ArrayBlockingQueue;

public class PP05 {
public static void main(String[] args) {
	Dueue dueue = new Dueue(5);
	dueue.insertLeft(1);
	dueue.insertLeft(2);
    dueue.insertRight(3);
    dueue.insertRight(4);
	while(!dueue.isEmpty()) {
		System.out.println(dueue.removeLeft());
	}
	
}
}
class Dueue{
	int left=0;
	int right=0;
	int queArr[];
	int maxSize;
	int size=0;
	public Dueue(int maxSize) {
this.maxSize=maxSize;
queArr=new int[maxSize];
	}
	public void insertLeft(int value) {
		if(isFull()) {
	System.out.println("已经满了");
	
		}else {
			if(left==0) {
				queArr[left]=value;
				left=maxSize-1;
			
			size++;
			}else {
				queArr[left--]=value;
				size++;
			}
		}
	}
	public int  removeLeft() {
		if(left==maxSize-1) {
			
			left=0;
			int tem=queArr[left];
			size--;
			return tem;
		}else {
			size--;
			return queArr[++left];
		}
	}
	public void insertRight(int value) {
		if(isFull()) {
	System.out.println("已经满了");
		}else {
			
				if(right==maxSize-1) {
					right=0;
					queArr[right]=value;
					size++;
				}else {
					size++;
					queArr[++right]=value;
				}
			
		}
	}
	public int removeRight() {
		if(right==0) {
			int tmp=queArr[right];
			right=maxSize-1;
			size--;
			return tmp;
		}else {
			size--;
			return queArr[right--];
		}
	}
	public  boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(maxSize==size) {
			return true;
		}
		return false;
	}
}