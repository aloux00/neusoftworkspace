package doublexi.component.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public abstract class AbsJMenu  extends JMenu implements ActionListener{
	protected AbsJMenuBar bar;
	public AbsJMenu(String name,AbsJMenuBar bar) {
super(name);
this.bar=bar;
bar.add(this);
init();
}
public AbsJMenuBar getBar() {
	return bar;
}

protected abstract void init();

/**
 * ����������룬�˵����������д��
 */

@Override
public void actionPerformed(ActionEvent e) {
	
}


}
