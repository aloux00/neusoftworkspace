import java.util.concurrent.TimeUnit;

public class TT09 {
	
 static   boolean flag=true;
public static void main(String[] args) {
	
	new Thread(() ->{
		while(flag) {
			
		}
		
	}).start();
	try {
		TimeUnit.SECONDS.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	flag=false;
	System.out.println("main.结束");
}
}
