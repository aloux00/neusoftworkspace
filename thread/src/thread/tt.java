package thread;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.WeakReference;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tt {
	private void hehe() {
		while(true) {
			
		}
	}
	public void haha() {
		while(true) {
			new Thread(()->{
				hehe();
			}).start();
		}
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}

class MyFrame extends JFrame {
	JButton button=new JButton("一键物理超度本电脑");
	JPanel pane=new JPanel();
public MyFrame() {
	init();
	this.setBounds(300, 400, 300, 150);
	this.setLayout(new BorderLayout());
	this.add(pane);
	pane.add(button,BorderLayout.CENTER);
	this.setVisible(true);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
private void init() {
button.addActionListener((e)->{
	new tt().haha();
});
	
}
}