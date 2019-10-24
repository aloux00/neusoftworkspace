
public class T2 {
public static void main(String[] args) {
	Thread thread = new Thread(()->{
		for(int i=0;i<1000;i++)
			System.out.println("001  "+i);
	}
	);
	Thread thread2 = new Thread(()->{
		for(int i=0;i<1000;i++)
			System.out.println("002  "+i);
	}
	) ;
	thread.setPriority(10);
	thread2.setPriority(1);
	thread.start();
	thread2.start();
	
}
}
