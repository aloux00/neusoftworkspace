package doublexi.MainThread.main.otherThread.impl.reader;

import java.awt.BorderLayout;
import java.io.UnsupportedEncodingException;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import doublexi.Factory.impl.EditSwingFactory;
import doublexi.Factory.impl.MainSwingFactory;
import doublexi.Frame.AbsEditFrame;
import doublexi.Frame.AbsJFrame;
import doublexi.Frame.AbsReadFrame;
import doublexi.Frame.impl.EditFrame;
import doublexi.MainThread.main.otherThread.AbsFrameThread;
import doublexi.MainThread.main.otherThread.impl.notpad.component.bar.NotPadMenuBar;
import doublexi.MainThread.main.otherThread.impl.notpad.component.txtarea.EditArea;
import doublexi.MainThread.main.otherThread.impl.reader.component.bar.ReaderMenuBar;
import doublexi.MainThread.main.otherThread.impl.reader.component.txtarea.ReadTxtArea;
import doublexi.component.menu.AbsJMenu;

public class Reader extends AbsFrameThread  {
	protected JLabel label;
	
	@Override
	public void init() {
		EditSwingFactory factory = new EditSwingFactory();
		 AbsReadFrame readFrame = factory.getReaderFrame("ÔÄ¶ÁÆ÷");
			new ReaderMenuBar("´ò¿ª", readFrame);
		 setFrame(readFrame);
		 ReadTxtArea area = new ReadTxtArea(readFrame.getContentPane());
		readFrame.setTxtarea(area);
		area.setLineWrap(true);
		area.setEditable(false);
		
	}


}
