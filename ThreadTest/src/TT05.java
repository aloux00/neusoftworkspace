import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TT05 {
public static void main(String[] args) {
	ArrayBlockingQueue<Object> que=new ArrayBlockingQueue<>(10);
	new Thread(() ->{
		while(true){
			
			try {
				que.put(new Object());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("添加了一个");
		}
	}).start();
	new Thread(() ->{
		while(true){
			
			Object remove;
			try {
				remove = que.take();
				System.out.println(remove);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}).start();
	
}
}
