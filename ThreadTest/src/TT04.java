import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TT04 {
	
public static void main(String[] args) {
	CountDownLatch latch=new CountDownLatch(10);
	System.out.println("haha");
try {
	latch.await();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

System.out.println("papa");

}
public static void haha() {
HashSet set;
}
}
