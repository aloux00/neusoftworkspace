import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PP07 {
public static void main(String[] args) {
	new InputFrame();
}
}
class InputFrame extends JFrame {
	JTextArea area=new JTextArea();
	
public InputFrame() {
	init();
	this.setTitle("徒劳的输入");
	this.setBounds(850,750,500,100);
	this.add(area,BorderLayout.CENTER);
	this.setAlwaysOnTop(true);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
	
	
}

private void init() {
	area.setFont(new Font("宋体", Font.BOLD, 40));
	area.getDocument().addDocumentListener(new DocumentListener() {
		
		@Override
		public void removeUpdate(DocumentEvent e) {
		}
		
		@Override
		public void insertUpdate(DocumentEvent e) {
			
			if(area.getText().length()>=11) {
				SwingUtilities.invokeLater(new   Runnable(){
					  public   void   run(){
					      area.setText("");
					  }
					});
			}
		}
		
		@Override
		public void changedUpdate(DocumentEvent e) {
		}
	});
}
private void delete() {
	area.setText("");
}
}
