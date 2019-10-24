package thread;

import java.util.concurrent.TimeUnit;

public class Account {
String name;
double balance;
public synchronized void set(String name,double balance) {
this.name=name;

try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
this.balance=balance;
}
public synchronized double getBalance(String name) {
	return this.balance;
}
public static void main(String [] args) {
	Account a=new Account();
	new Thread(()->a.set("shuangxi", 100.0)).start();
try {
	TimeUnit.SECONDS.sleep(1);
	TimeUnit.HOURS.sleep(1);
	
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	System.out.println(a.getBalance(""));
}
}
