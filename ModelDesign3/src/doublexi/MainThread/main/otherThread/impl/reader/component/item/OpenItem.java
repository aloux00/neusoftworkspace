package doublexi.MainThread.main.otherThread.impl.reader.component.item;

import java.awt.event.ActionEvent;
import java.util.Map;

import doublexi.Frame.AbsReadFrame;
import doublexi.MainThread.main.otherThread.impl.reader.component.txtarea.ReadTxtArea;
import doublexi.component.menu.AbsBarItem;
import doublexi.component.menu.AbsJMenuBar;
import doublexi.utils.ioutils.IOUtils;

public class OpenItem extends AbsBarItem {

	public OpenItem(String name, AbsJMenuBar bar) {
		super(name, bar);
		this.setSize(5, 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
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
				area.readFirstPage();
			}
			
			
		}
		
	}

}
