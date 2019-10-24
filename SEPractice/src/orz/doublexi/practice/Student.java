package orz.doublexi.practice;

class Student {
	public static void main(String[] args) {
		Student student = new Student();
		student.setAge(20);
		student.setName("ÃÏË«Ï²");
		student.setStuNum("002");
		
	}

	private String stuNum;
	private String name;
	
	private int age;
	private float height;

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

}
