package thread;

import java.awt.List;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class T /*implements Runnable*/ {
	/*volatile*/ boolean running =true;
void m() {
	System.out.println("m  start");
	while(running) {
//	System.out.println("。。。。。。");
	}
	System.out.println(" m end");
	
	
}

//@Override
//public void run() {
//	// TODO Auto-generated method stub
//	m();
//	
//}






public static void main(String[] args) {
	
	T t=new T();

//	Stream parallelStream = list.parallelStream();
//	parallelStream.forEach(System.out::println);
//	new Thread(aa::haha).start();
	//new Thread(()->{}).start();
new Thread(t::m).start();
//	TestThread testThread = new TestThread();
//	testThread.start();

	
	
try {
	TimeUnit.SECONDS.sleep(1);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
t.running=false;
//testThread.running=false;
System.out.println("厮将個葎false");
}
}
























class TestThread extends Thread{
	volatile boolean running =true;
	@Override
	public void run() {
		System.out.println("m  start");
		while(running) {
		System.out.println("。。。。。。");
		}
		System.out.println(" m end");
	}
}
class aa{
	public static void haha() {
		
	}
}