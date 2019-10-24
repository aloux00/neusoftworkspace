package doublexi.Frame;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

import doublexi.component.txt.AbsTxtArea;

public abstract class AbsJFrame extends JFrame{


	public AbsJFrame() {
		
	}
public void setDestroyByExit(boolean flag) {
	if(flag) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
public void initFrame(String name,double size,boolean canResize) {
	setTitle(name);
	setBounds((int)(500*size), 20,(int)(1000*size), (int)(1000*size));
	if(canResize) {
		setResizable(canResize);
	}else {
		setResizable(false);
	}
	
}
public void initFrame() {
this.initFrame("Ë«Ï²µÄÄ¬ÈÏ´°¿Ú", 0.50, true);
}
public abstract void setDefLayout(LayoutManager manager);
public abstract void addItemToJFContentPane(Component com);
}
