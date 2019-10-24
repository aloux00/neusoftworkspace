package www;

public class cc extends bb {
public cc() {
System.out.println(((aa)this).toString());
}
public static void main(String[] args) {
	cc cc = new cc();
cc.haha();	
}
public void haha() {
	System.out.println(((aa)this).toString());
	System.out.println(((bb)this).i);
	System.out.println(((aa)this).i);
	((aa)this).pa();
	((bb)this).pa();
}
}
