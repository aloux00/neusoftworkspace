package doublexi.MainThread.main.otherThread.impl.notpad;

import java.awt.BorderLayout;

import javax.swing.JTextArea;

import doublexi.Factory.impl.EditSwingFactory;
import doublexi.Factory.impl.MainSwingFactory;
import doublexi.Frame.AbsEditFrame;
import doublexi.Frame.AbsJFrame;
import doublexi.Frame.impl.EditFrame;
import doublexi.MainThread.main.otherThread.AbsFrameThread;
import doublexi.MainThread.main.otherThread.impl.notpad.component.bar.NotPadMenuBar;
import doublexi.MainThread.main.otherThread.impl.notpad.component.txtarea.EditArea;
import doublexi.component.menu.AbsJMenu;

public class NotPad extends AbsFrameThread  {
	protected EditArea area;
	
	@Override
	public void init() {
		EditSwingFactory factory = new EditSwingFactory();
		 AbsEditFrame editFrame = factory.getFrame("双喜的记事本啊");
		 setFrame(editFrame);
		new NotPadMenuBar("文件",editFrame);
		area =new EditArea(editFrame.getPanel());
		area.setLineWrap(true);
		editFrame.setArea(area);
	}
	

}
