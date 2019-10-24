package doublexi.MainThread.main.otherThread.impl.notpad.component.item;

import java.awt.event.ActionEvent;
import java.util.Map;

import javax.swing.JMenu;

import doublexi.Frame.AbsEditFrame;
import doublexi.Frame.AbsJFrame;
import doublexi.Frame.impl.EditFrame;
import doublexi.MainThread.main.otherThread.impl.notpad.component.txtarea.EditArea;
import doublexi.component.menu.AbsJMenu;
import doublexi.component.menu.AbsJMenuItem;
import doublexi.component.txt.AbsTxtArea;
import doublexi.utils.ioutils.IOUtils;

public class OpenFile extends AbsJMenuItem {
protected AbsTxtArea area;
	public OpenFile(String name, AbsJMenu menu) {
		super(name, menu);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		AbsEditFrame frame=(AbsEditFrame)getMenu().getBar().getFrame();
				 area= frame.getArea();
				 Map<String, Object> map = IOUtils.fromSelectFrameToBytes();
				 frame.setPath((String)map.get("path"));
String txt=new String((byte[])map.get("txt"));
		area.setText(txt);
	}


}
