package orz.doublexi.calzz12;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

public class testSwing extends JFrame{
	JTextField text=new JTextField();
public static void main(String[] args) {
	new testSwing();
}
public testSwing() {
	this.setBounds(100, 100, 500, 500);
	this.add(text);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
	text.getDocument().addDocumentListener(new DocumentListener() {
		
		@Override
		public void removeUpdate(DocumentEvent e) {
System.out.println("docu remo");			
		}
		
		@Override
		public void insertUpdate(DocumentEvent e) {
			System.out.println("docu   insert");
			try {
				String string = e.getDocument().getText(0,e.getDocument().getLength());
				if(string.length()>7f) {
					text.setText("hhhhhh");
				}
			} catch (BadLocationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		@Override
		public void changedUpdate(DocumentEvent e) {
			System.out.println("docu  change");		
			
		}
	});
	text.addPropertyChangeListener(new PropertyChangeListener() {
		
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
System.out.println("pro");			
		}
	});
	text.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("action");
		}
	});
}
}
