import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JFrame;

public class TT11 {
public static void main(String[] args) {
	ReentrantLock lock=new ReentrantLock();
	Condition aa = lock.newCondition();
	Condition bb = lock.newCondition();
	new Thread(() ->{
		lock.lock();
		lock.lock();
		System.out.println("1");
		try {
			TimeUnit.SECONDS.sleep(2);
			aa.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("2");
		lock.unlock();
		lock.unlock();
	}).start();
	new Thread(() -> {
		lock.lock();
		System.out.println("haha");
		aa.signalAll();
		lock.unlock();
		
		new JFrame().repaint();;
	}).start();
	
}
}
