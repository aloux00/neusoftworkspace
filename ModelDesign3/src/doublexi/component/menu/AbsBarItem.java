package doublexi.component.menu;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public abstract class AbsBarItem extends JMenuItem implements ActionListener{
	protected AbsJMenuBar bar;
	public AbsBarItem(String name,AbsJMenuBar bar) {
super(name);
this.bar=bar;
bar.add(this);
this.addActionListener(this);
}
	public AbsJMenuBar getBar() {
		return bar;
	}

}
