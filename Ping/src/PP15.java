
public class PP15 {
public static void main(String[] args) {
	Tree tree = new Tree();
	tree.add(1);
	tree.add(4);
	tree.add(5);
	tree.add(9);
	tree.add(2);
	tree.add(3);
	System.out.println("\n#######前序#######");
	tree.Qianshow();
	System.out.println("\n########中序######");
	tree.Zhongshow();
	System.out.println("\n######后序#########");
	
	tree.Houshow();
}
}

class Tree{
	Tree pre;
	Tree next;
	Integer data;
	public Tree(int i) {
		this.data=i;
	}
	public Tree() {
		
	}
	public void add(int i) {
		if(data==null) {
			data=i;
			return;
		}
		
		
		if(i<data) {
			if(pre==null) {
				pre=new Tree(i);
			}else {
				pre.add(i);
			}
		}else if(i>data) {
			if(next==null) {
				next=new Tree(i);
			}else {
				next.add(i);
			}
		}else {
			System.out.println("相等，不予存入");
			return;
		}
	}
	
	
	public void Qianshow() {
		if(data!=null) {
			System.out.print(data);
		}
		if(pre!=null) {
		pre.Qianshow();
		}
		if(next!=null) {
		next.Qianshow();

		}
	}
	
	public void Zhongshow() {
		if(pre!=null) {
			pre.Zhongshow();
		}
		if(data!=null) {
			System.out.print(data);
		}
		if(next!=null) {
			next.Zhongshow();
			
		}
	}

	public void Houshow() {
		if(pre!=null) {
			pre.Houshow();
			}
		if(next!=null) {
			next.Houshow();
			}
		if(data!=null) {
			System.out.print(data);
		}
		
		
	}
	public Tree remove(int i) {
		if(data==i) {
			
		}
		return null;
	}
	
}