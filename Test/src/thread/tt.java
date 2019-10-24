package thread;

public class tt {
public static void main(String[] args) {
new Thread() {

	@Override
	public void run() {
		synchronized (tt.class) {
			System.out.println("1");
			try {
				tt.class.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(2);
		}
		super.run();
	}

}.start();
}
}
