import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TT03 {
public static void main(String[] args) {
	ExecutorService service=Executors.newFixedThreadPool(10);
	
	System.out.println(service.getClass());
	Future<Object> future = service.submit(new Callable<Object>() {

		@Override
		public Object call() throws Exception {
			// TODO Auto-generated method stub
			return new Object();
		}
	});
	
	System.out.println("xiayibu");
	try {
		TimeUnit.SECONDS.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(future.isDone());
	service.shutdown();
	System.out.println(service.isShutdown());
	
}
}
