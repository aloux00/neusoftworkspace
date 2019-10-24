package Practice;

public class Student extends Person {
private String school;

void study() {
	System.out.println("study in" +school);

}

public Student(String name, int age, String sex, String school) {
	super(name, age, sex);
	this.school = school;
}


public static void main(String[] args) {
	Student student = new Student("tom", 19, "nan", "山东理工");
	student.study();
	student.getInfo();
	student.sayHello();
}
}