package orz.doublexi.frame.impl;

import javax.swing.JLabel;

import orz.doublexi.frame.AbsFrame;

public class MyPriFrame extends AbsFrame {
JLabel title=new JLabel("欢迎使用用户登录系统");
	public MyPriFrame(String name1, String name2) {
		super(name1, name2);
		this.add(title);
		this.setVisible(true);
		
		// TODO Auto-generated constructor stub
	}

@Override
public void initButton1() {
	System.out.println("111");
	
}
@Override
public void initButton2() {
System.out.println("2222");	
}


public static void main(String[] args) {
	new MyPriFrame("登录", "注册");
}
}
