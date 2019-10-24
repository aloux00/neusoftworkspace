package doublexi.MainThread.main.otherThread.impl.reader.component.bar;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import doublexi.Frame.AbsJFrame;
import doublexi.MainThread.main.otherThread.impl.reader.component.item.OpenItem;
import doublexi.MainThread.main.otherThread.impl.reader.component.item.OpenMenu;
import doublexi.component.menu.AbsJMenuBar;


public class ReaderMenuBar extends AbsJMenuBar {

	public ReaderMenuBar(String name, AbsJFrame frame) {
		super(name, frame);
	}

	@Override
	protected void init() {
		    frame.getContentPane().setLayout(new BorderLayout());
			frame.getContentPane().add(this,BorderLayout.NORTH);
		//	new OpenMenu("打开Story",this);
			new OpenItem("打开", this);
			new OpenItem("书签", this);
		
	}


	
	
}
