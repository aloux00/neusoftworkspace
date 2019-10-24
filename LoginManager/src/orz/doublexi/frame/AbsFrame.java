package orz.doublexi.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class AbsFrame extends JFrame implements ActionListener {
	JPanel panel=new JPanel();
	JButton button1=new JButton();
	JButton button2=new JButton();
public AbsFrame(String name1,String name2) {
	button1.setText(name1);
	button2.setText(name2);
	button1.addActionListener(this);
	button2.addActionListener(this);
	this.setContentPane(panel);
	panel.setLayout(null);
	button1.setBounds(50,90,80,30);
	panel.add(button1);
	button2.setBounds(160,90,80,30);
	panel.add(button2);
	this.setBounds(200,200,300,200);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}
public void setPanel(JPanel panel) {
	this.panel = panel;
}
public void setButton1(JButton button1) {
	this.button1 = button1;
}
public void setButton2(JButton button2) {
	this.button2 = button2;
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button1) {
initButton1();
	}else if(e.getSource()==button2) {
initButton2();

}
	
}
public abstract void initButton1();
public abstract void initButton2();
}

