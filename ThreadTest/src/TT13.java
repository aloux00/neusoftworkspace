import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TT13 {
	ExecutorService service=Executors.newFixedThreadPool(10);
public static void main(String[] args) {
	hehe:
	for(;;) {
		for(int i=0;i<10;i++) {
			if(i==7) {
				System.out.println("haha");
				break hehe;
			}
			System.out.println(i);
		}
	}
}
}

