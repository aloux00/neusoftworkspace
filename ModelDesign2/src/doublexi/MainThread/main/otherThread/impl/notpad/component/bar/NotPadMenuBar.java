package doublexi.MainThread.main.otherThread.impl.notpad.component.bar;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import doublexi.Frame.AbsJFrame;
import doublexi.MainThread.main.otherThread.impl.notpad.component.menu.FileMenu;
import doublexi.component.menu.AbsJMenuBar;


public class NotPadMenuBar extends AbsJMenuBar {

	public NotPadMenuBar(String name, AbsJFrame frame) {
		super(name, frame);
	}

	@Override
	protected void init() {
			
			frame.add(this,BorderLayout.NORTH);
			new FileMenu("нд╪Ч",this);
	}


	
	
}
