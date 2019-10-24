import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class IOTest implements Serializable{
public static void main(String[] args) throws IOException, Exception {
	FileInputStream in=new FileInputStream("D://aa.txt");
	BufferedInputStream bf=new BufferedInputStream(in);
	FileReader re=new FileReader("D:\\aa.txt");
	BufferedReader br=new BufferedReader(re);
	char[] cbuf=new char[1];
	while(br.read(cbuf)!=-1) {
	System.out.print(new String(cbuf));
	}
	System.out.println("\n###################################");
	byte[] b=new byte[2];
	while(bf.read(b)!=-1) {
		System.out.print(new String(b));
	}
	
	
	
	
	Thread a=new Thread(new Runnable() {
		@Override
		public void run() {
System.out.println("runnable的方法0");			
		}
	}) {

		@Override
		public void run() {
		System.out.println("重写的方法1");
		super.run();
		System.out.println("重写的方法2");
		}
		
	};
//	a.start();
Thread aa=new Thread(new Runnable() {
		@Override
		public void run() {
System.out.println("runnable的方法");			
		}
	});
aa.start();
Thread.sleep(1000);
System.out.println(a.isAlive());
System.out.println(aa.isAlive());
aa.run();
a.run();
}
}


