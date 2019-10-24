package doublexi.Frame;

import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import doublexi.component.txt.AbsTxtArea;

public abstract class AbsReadFrame extends AbsJFrame {
	private JTextArea txtarea;
	private String path;
	private Container pane;
	public AbsReadFrame() {
		pane = this.getContentPane();
	}

	
	
	
	







	public JTextArea getTxtarea() {
		return txtarea;
	}












	public void setTxtarea(JTextArea txtarea) {
		this.txtarea = txtarea;
	}












	public Container getPane() {
		return pane;
	}





	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
		
	}
	
	public void setDefLayout(LayoutManager manager) {
		if(manager!=null) {
			pane.setLayout(manager);
		}
	}
	public void addItemToJFContentPane(Component com) {
		pane.add(com);
	}
//public static void main(String[] args) {
//	AbsEditFrame absEditFrame = new AbsEditFrame();
//	absEditFrame.setArea(new AbsTxtArea(absEditFrame));
//	absEditFrame.setVisible(true);
//}
}


