import java.util.concurrent.TimeUnit;

public class GCTest {
	@Override
		protected void finalize() throws Throwable {
System.out.println("要死了要死了！！！！");
	}
	public void hehe() {
		System.out.println("hehe");
	}
public static void main(String[] args) {
	new GCTest().hehe();
	System.gc();
	new Thread() {
		@Override
		public void run() {
while(true) {
	try {
		TimeUnit.SECONDS.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("just waitting one seconds!!!");
}
		}
	}.start();

}
}
