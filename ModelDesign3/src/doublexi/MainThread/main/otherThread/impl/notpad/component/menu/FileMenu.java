package doublexi.MainThread.main.otherThread.impl.notpad.component.menu;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import doublexi.MainThread.main.otherThread.impl.notpad.component.item.OpenFile;
import doublexi.MainThread.main.otherThread.impl.notpad.component.item.SaveFile;
import doublexi.MainThread.main.otherThread.impl.notpad.component.item.newFile;
import doublexi.component.menu.AbsJMenu;
import doublexi.component.menu.AbsJMenuBar;

public class FileMenu extends AbsJMenu{

public FileMenu(String name, AbsJMenuBar bar) {
		super(name, bar);
	}

@Override
protected void init() {

	new newFile("新建", this);
	new OpenFile("打开文件", this);
	new SaveFile("保存", this);
	
}


}
