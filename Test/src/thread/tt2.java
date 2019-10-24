package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class tt2 {
public synchronized static void main(String[] args) {
	tt.class.notifyAll();
	CountDownLatch con=new CountDownLatch(2);
	Lock lock=new ReentrantLock();
}
}
