package Practice;

public class Person {
private String name;
private int age;
private String sex;

public Person(String name, int age, String sex) {
	super();
	this.name = name;
	this.age = age;
	this.sex = sex;
 }

void  getInfo(){
	System.out.println("Person [name=" + name + ", age=" + age + ", sex=" + sex + "]");
}

void sayHello() {
	System.out.println("hello");
}
}
