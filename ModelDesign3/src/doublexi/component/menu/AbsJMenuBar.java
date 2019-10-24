package doublexi.component.menu;

import java.awt.event.ActionListener;

import javax.swing.JMenuBar;

import doublexi.Frame.AbsJFrame;

public abstract class AbsJMenuBar extends JMenuBar{
	protected AbsJFrame frame;
public AbsJMenuBar(String name,AbsJFrame frame) {
	setName(name);
	this.frame=frame;
	init();
}
public AbsJFrame getFrame() {
	return frame;
}

protected abstract void init();


}
