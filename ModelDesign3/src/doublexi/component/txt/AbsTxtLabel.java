package doublexi.component.txt;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import doublexi.Frame.AbsJFrame;
import doublexi.component.menu.AbsJMenuBar;

public class AbsTxtLabel extends JLabel {
	protected Container con;
	
	public AbsTxtLabel() {
	}
	public AbsTxtLabel(Container con) {

this.con=con;
//con.setLayout(new BorderLayout());
con.add(this,BorderLayout.CENTER);
//con.add(this);
}
public Container getContainer() {
	return con;
}

}
