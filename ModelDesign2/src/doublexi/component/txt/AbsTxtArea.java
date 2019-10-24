package doublexi.component.txt;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import doublexi.Frame.AbsJFrame;
import doublexi.component.menu.AbsJMenuBar;

public class AbsTxtArea extends JTextArea {
	protected Container con;
	
	public AbsTxtArea() {
	}
	public AbsTxtArea(Container con) {
this.con=con;

	con.add(this);

}
public Container getContainer() {
	return con;
}

}
