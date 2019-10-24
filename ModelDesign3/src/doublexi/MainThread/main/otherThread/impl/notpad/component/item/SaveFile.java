package doublexi.MainThread.main.otherThread.impl.notpad.component.item;

import java.awt.event.ActionEvent;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import doublexi.Frame.AbsEditFrame;
import doublexi.Frame.AbsJFrame;
import doublexi.Frame.impl.EditFrame;
import doublexi.MainThread.main.otherThread.impl.notpad.component.txtarea.EditArea;
import doublexi.component.menu.AbsJMenu;
import doublexi.component.menu.AbsJMenuItem;
import doublexi.component.txt.AbsTxtArea;
import doublexi.utils.ioutils.IOUtils;

public class SaveFile extends AbsJMenuItem {
protected AbsTxtArea area;
	public SaveFile(String name, AbsJMenu menu) {
		super(name, menu);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		AbsEditFrame frame=(AbsEditFrame)getMenu().getBar().getFrame();
				 area= frame.getArea();
				 String path=frame.getPath();
String txt=area.getText();
if(path==null) {
	JFileChooser chooser=new JFileChooser();
	int i = chooser.showSaveDialog(area);
	if(i==0) {
		String savepath = chooser.getSelectedFile().getAbsolutePath();
		System.out.println(savepath);
		IOUtils.saveStringByPath(savepath, area.getText());
		
	}
}


}}
