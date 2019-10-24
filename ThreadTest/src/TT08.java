
public class TT08 {
public static void main(String[] args) {
	ThreadLocal<Object> l=new ThreadLocal<>();
	l.set(new Object());
	System.out.println(l.get());
	new Thread(()-> {
		Object object = l.get();
		System.out.println(object);
		l.set(new Object());
		object = l.get();
		System.out.println(object);
		
	}).start();
}
}
