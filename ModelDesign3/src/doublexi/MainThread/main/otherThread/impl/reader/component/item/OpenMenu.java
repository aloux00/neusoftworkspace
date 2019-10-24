package doublexi.MainThread.main.otherThread.impl.reader.component.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.event.MenuEvent;

import doublexi.Frame.AbsJFrame;
import doublexi.Frame.AbsReadFrame;
import doublexi.MainThread.main.otherThread.impl.notpad.component.item.OpenFile;
import doublexi.MainThread.main.otherThread.impl.notpad.component.item.SaveFile;
import doublexi.MainThread.main.otherThread.impl.notpad.component.item.newFile;
import doublexi.MainThread.main.otherThread.impl.reader.component.txtarea.ReadTxtArea;
import doublexi.component.menu.AbsJMenu;
import doublexi.component.menu.AbsJMenuBar;
import doublexi.utils.ioutils.IOUtils;
import sun.nio.ch.IOUtil;

public class OpenMenu extends AbsJMenu {



public OpenMenu(String name, AbsJMenuBar bar) {
		super(name, bar);
		addMenuListener(this);
	}

@Override
protected void init() {
}
 

@Override
public void menuSelected(MenuEvent e) {
	if(e.getSource()==this) {
		Map<String, Object> map = IOUtils.fromSelectFrameToBytes();
		if(map!=null) {
			AbsReadFrame frame=	(AbsReadFrame)getBar().getFrame();
			ReadTxtArea area=(ReadTxtArea)frame.getTxtarea();
			String path=(String)map.get("path");
			try {
				char[] array = new String ((byte[])map.get("txt"),IOUtils.getCodeStyle(path)).toCharArray();
				
				area.setTxt(array);
			} catch (Exception e1) {
				e1.printStackTrace();
			} 
			area.setPath(path);
			frame.setTitle(path);
			System.out.println(area.getPath());
			area.readFirstPage();
		}
		
		
	}
}


}
