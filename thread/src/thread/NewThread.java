package thread;

public class NewThread implements Runnable {
	

	@Override
	public void run() {
		
		System.out.println(this.toString());
System.out.println("hehe");
	}

	public static void main(String[] args) {
		int i=0;
		if(i>0)System.out.println("hehe");
		else System.out.println("haha");
Thread thread=new Thread(new NewThread());		
	thread.start();
	}
}
