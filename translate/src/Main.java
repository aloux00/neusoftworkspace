import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame {
	JTextField area01=new JTextField();
	JTextArea area02=new JTextArea();
	
	JButton  button =new JButton("点击翻译");
public Main() {
	this.setBounds(1100, 700, 300, 100);
	this.setTitle("英语单词翻译工具[doublexi]");
	this.setResizable(false);
	area02.setFont(new Font("宋体", Font.BOLD, 30));
	this.add(area01,BorderLayout.NORTH);
	this.add(button,BorderLayout.CENTER);
	this.add(area02,BorderLayout.SOUTH);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setAlwaysOnTop(true);
	this.setVisible(true);
	this.button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				String string = Utils.translate(area01.getText());
				area02.setText(string);
			}
			
		}
	});
	this.area01.addKeyListener(new  KeyAdapter() {

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				String string = Utils.translate(area01.getText());
				area02.setText(string);
			}
		}
		
	});
}
public static void main(String[] args) {
	new Main();
}
}
