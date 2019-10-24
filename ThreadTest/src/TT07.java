import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TT07 {
public static void main(String[] args) {
	ReentrantLock lock=new ReentrantLock(false);
	List<Object> list =new ArrayList<Object>();
	int max=10;
	new Thread(() ->{
		while(true) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
lock.lock();
			
			if(list.size()<max) {
				list.add(new Object());
				
			}else {
				System.out.println("放满了，我要wait了");
				
			}
		} finally {
			lock.unlock();
		}
			

		}
	}).start();
	new Thread(() ->{
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				System.out.println("尝试获取lock,获取不到就等待");
				lock.lock();
				if(list.size()>0) {
					Object object = list.get(0);
					list.remove(object);
					System.out.println("我获取到了"+object);
					
				}else {
					System.out.println("没东西了，我要休息了");
				
				}
			} finally {
				lock.unlock();
			}
			
		
		}

		
	}).start();
	
}
}
