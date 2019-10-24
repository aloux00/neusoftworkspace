package doublexi.Frame;

import java.awt.Component;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public abstract class AbsActionFrame extends AbsJFrame {
	private JPanel panel=new JPanel();
	public AbsActionFrame() {
		//this.getContentPane().add(panel);
		this.setContentPane(panel);
	}
	public void setDefLayout(LayoutManager manager) {
		if(manager!=null) {
			panel.setLayout(manager);
		}
	}
	public void addItemToJFContentPane(Component com) {
		panel.add(com);
	}
	public JPanel getPanel() {
		return panel;
	}
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	
}
