package doublexi.MainThread.main.component.button;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import doublexi.MainThread.main.otherThread.impl.notpad.NotPad;
import doublexi.component.button.AbsButton;

public class main_Button_notepad extends AbsButton {

	public main_Button_notepad(String name) {
		super(name);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	new Thread(new NotPad()).start();
	}

}
