package orz.doublexi.list;

public class Test {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	for(int i=0;i<10;i++) {
	list.add(new Cat(i));
	}
	Iterator it=list.iterator();
	while(it.hasNext()) {
		Object o=it.next();
	System.out.println(o.toString());
	}
}
}
