package aa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class test {
	public static void main(String[] args) {
		new test().getString();
	}
public String getString() {
	try {
		//InputStream in=new FileInputStream("/a.txt");
		InputStream in= test.class.getResourceAsStream("/WEB-INF/a.txt");
		byte[] a=new byte[100];
		
		in.read(a);
		String ss=new String(a);
		System.out.println(ss);
		return ss;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return null;
}
}
