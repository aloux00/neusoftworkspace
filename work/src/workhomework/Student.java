package workhomework;

public class Student {
private String name;
private String id;
private int score;
	
public Student(String name, String id, int score) {
	super();
	this.name = name;
	this.id = id;
	this.score = score;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}


@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", score=" + score + "]";
}
public static void main(String[] args) {
	Student[] students=new Student[100];
	for(int i=0;i<100;i++) {
		students[i]=new Student("Ñ§Éú"+i, "00"+i, (int)(Math.random()*100));
	}
	Student t=null;
	for(int i=1;i<=students.length-1;i++) {
		for(int j=0;j<students.length-i;j++) {
	if(students[j].getScore()>students[j+1].getScore()) {
		t=students[j];
		students[j]=students[j+1];
		students[j+1]=t;
	}
		}
	}
	for(int i=0;i<students.length;i++) {
		System.out.println(students[i].toString());
			
	}
}
}
