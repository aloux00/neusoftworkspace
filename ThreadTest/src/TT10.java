import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

public class TT10 {
public static void main(String[] args) {
	ReentrantLock lock=new ReentrantLock();
	lock.lock();
	lock.unlock();
	ExecutorService service;
	FutureTask<Object> aa;
	HashMap map;
}
}
