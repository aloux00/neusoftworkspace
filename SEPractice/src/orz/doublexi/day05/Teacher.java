package orz.doublexi.day05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Teacher {
public Teacher() {
	return ;
}
public Teacher(String name) {
	this();
	return ;
}
private String name;
private  int age;
public String getName() {
	return name;
	
}
public int getAge() {
	return age;
}
public void setName(String name) {
this.name=name;
}
public void setAge(int age) {
	

	this.age=age;
}
public Teacher(int age) {

}
class Son{
	public int age=15;
	public void  vv() {
		System.out.println(Teacher.this.age);
		System.out.println(Son.this.age);
		
	}
}
public static void main(String[] args) {
	System.out.println(new Teacher());;
	//InputStream in = Teacher.class.getResourceAsStream("a.txt");
	InputStream in = null;
	//in=Teacher.class.getResourceAsStream("a.txt");
	try {
		in=new FileInputStream("src/a.txt");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	byte[] aa=new byte[100];
	try {
		in.read(aa);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(new  String (aa));
}
}
