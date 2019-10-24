package doublexi.Frame;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public abstract class AbsJFrame extends JFrame{
	
public void setDestroyByExit(boolean flag) {
	if(flag) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
public void setDefLayout(LayoutManager manager) {
	if(manager==null) {
		setLayout(new FlowLayout());
	}else {
		setLayout(manager);
	}
}
public void addItemToJFContentPane(Component com) {
	this.getContentPane().add(com);
}
public void initFrame(String name,double size,boolean canResize,boolean show) {
	setTitle(name);
	setBounds((int)(500*size), 20,(int)(1000*size), (int)(1000*size));
	if(canResize) {
		setResizable(canResize);
	}else {
		setResizable(false);
	}
	if(show) {
	setVisible(show);
	
	}
}
public void initFrame() {
this.initFrame("Ë«Ï²µÄÄ¬ÈÏ´°¿Ú", 0.50, true, true);
}




}
