package doublexi.Frame;

import java.awt.Component;
import java.awt.LayoutManager;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import doublexi.component.txt.AbsTxtArea;

public abstract class AbsEditFrame extends AbsJFrame {
	private AbsTxtArea area;
	private JScrollPane panel=new JScrollPane();
	private String path;
	public AbsEditFrame() {
		this.add(panel);
	}
	public AbsTxtArea getArea() {
		return area;
	}
	public void setArea(AbsTxtArea area) {
		this.area = area;
	}
	
	
	
	
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
		
	}
	//JScrollPane
	public JScrollPane getPanel() {
		return panel;
	}
//	public void setPanel(JScrollPane panel) {
//		this.panel = panel;
//	}
	public void setDefLayout(LayoutManager manager) {
		if(manager!=null) {
			panel.setLayout(manager);
		}
	}
	public void addItemToJFContentPane(Component com) {
		panel.add(com);
	}
//public static void main(String[] args) {
//	AbsEditFrame absEditFrame = new AbsEditFrame();
//	absEditFrame.setArea(new AbsTxtArea(absEditFrame));
//	absEditFrame.setVisible(true);
//}
}


