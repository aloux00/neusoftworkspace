package doublexi.MainThread.main.otherThread.impl.notpad.component.txtarea;

import java.awt.Container;

import javax.swing.JScrollPane;

import doublexi.component.txt.AbsTxtArea;

public class EditArea extends AbsTxtArea {

	public EditArea(JScrollPane panel) {
		super();
		panel.setViewportView(this);
	}

}
