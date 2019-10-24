package doublexi.component.menu;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public abstract class AbsJMenuItem extends JMenuItem implements ActionListener{
	protected AbsJMenu menu;
	public AbsJMenuItem(String name,AbsJMenu menu) {
super(name);
this.menu=menu;
menu.add(this);
this.addActionListener(this);
}
public AbsJMenu getMenu() {
	return menu;
}
}
