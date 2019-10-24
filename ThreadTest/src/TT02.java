import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TT02 {
public static void main(String[] args) {
	ExecutorService ee=Executors.newFixedThreadPool(10);
	ee.execute(()->{ try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}System.out.println("hehe");});
	
	System.out.println("haha");
	System.out.println(ee.getClass());
	
}
}
