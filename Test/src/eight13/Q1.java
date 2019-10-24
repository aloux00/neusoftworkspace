package eight13;

import java.util.Calendar;
import java.util.Date;

public class Q1 {
public static void main(String[] args) {
	//1
	for(int i=0;i<=20;i++) {
		Player.create();
	}
	//
}
}
//############################Q1
class Player{
	 private static int count;
	private Player() {
	}
	public static Player create() {
		
		count++;
		if(count<11) {
System.out.println("创建了一个球员");			
			return new Player();
		}
		System.out.println("对不起，已经创建了11个球员了");
		return null;
	}
}

//#################################Q2
class Vehicle{
	private final String brand;
	private String color;
	private double speed;
	public Vehicle(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
		this.speed=0;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getBrand() {
		return brand;
	}
	public void run() {
		System.out.println("run...");
	}
	
}

 class Car extends Vehicle{
private int loader;
	public Car(String brand, String color) {
		super(brand, color);
		// TODO Auto-generated constructor stub
	}
	public Car(String brand, String color, int loader) {
		super(brand, color);
		this.loader = loader;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
System.out.println("car run...");
	}
 }
 
 //##################################Q3
 abstract class Shape{
	 private double area;
	 private double per;
	 private String color;
	
	 public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape(String color) {
		super();
		this.color = color;
	}
	abstract double getArea();
	abstract double getPer();
	abstract void showAll();
	public String getColor(){
		return color;
	}
 }
 class Rectangle extends Shape{
	 private double width;
	 private double height;
		public Rectangle() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	public Rectangle(double width, double height,String color) {
			super(color);
			this.width = width;
			this.height = height;
		}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	double getPer() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}
	@Override
	void showAll() {
		// TODO Auto-generated method stub
		System.out.println("e,,, 这是showall方法");
	}
	 
 }
 //####################################Q4
 class ColaEmployee{
	 private String name;
	 private Date birthday;
	 private double gongzi;
	 public double   getSalary(int month) {
		 
		 if((birthday.getMonth()+1)==month) {
			 return gongzi+100;
		 }
		 return gongzi;
	 }
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public double getGongzi() {
		return gongzi;
	}

	public void setGongzi(double gongzi) {
		this.gongzi = gongzi;
	}

	public ColaEmployee(String name, Date birthday, double gongzi) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gongzi = gongzi;
	}
	
 }
 class SalariedEmployee extends ColaEmployee{

	public SalariedEmployee(String name, Date birthday, double gongzi) {
		super(name, birthday, gongzi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return super.getSalary(month);
	}
	



	 
 }
 class HourlyEmployee extends ColaEmployee{
	 private double gongzibyhour;
	 private int hournum;
	public HourlyEmployee(String name, Date birthday, double gongzi, double gongzibyhour, int hournum) {
		super(name, birthday, gongzi);
		this.gongzibyhour = gongzibyhour;
		this.hournum = hournum;
	}
	public double getGongzibyhour() {
		return gongzibyhour;
	}
	public void setGongzibyhour(double gongzibyhour) {
		this.gongzibyhour = gongzibyhour;
	}
	public int getHournum() {
		return hournum;
	}
	public void setHournum(int hournum) {
		this.hournum = hournum;
	}

	 
 }
 class SalesEmployee{
	 private double yuexiaoshoue;
	 private double tichenglv;
	public SalesEmployee(double yuexiaoshoue, double tichenglv) {
		super();
		this.yuexiaoshoue = yuexiaoshoue;
		this.tichenglv = tichenglv;
	}
	public double getYuexiaoshoue() {
		return yuexiaoshoue;
	}
	public void setYuexiaoshoue(double yuexiaoshoue) {
		this.yuexiaoshoue = yuexiaoshoue;
	}
	public double getTichenglv() {
		return tichenglv;
	}
	public void setTichenglv(double tichenglv) {
		this.tichenglv = tichenglv;
	}
	 
	 
 }
 class Company{
	 public void showGongzi(ColaEmployee emp) {
		 emp.getGongzi();
	 }
 }
 //#################################