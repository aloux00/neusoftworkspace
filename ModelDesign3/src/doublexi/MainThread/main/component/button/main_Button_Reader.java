package doublexi.MainThread.main.component.button;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import doublexi.MainThread.main.otherThread.impl.notpad.NotPad;
import doublexi.MainThread.main.otherThread.impl.reader.Reader;
import doublexi.component.button.AbsButton;

public class main_Button_Reader extends AbsButton {

	public main_Button_Reader(String name) {
		super(name);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	new Thread(new Reader()).start();
	}

}
