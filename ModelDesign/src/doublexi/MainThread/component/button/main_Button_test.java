package doublexi.MainThread.component.button;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import doublexi.component.button.AbsButton;

public class main_Button_test extends AbsButton {

	public main_Button_test(String name) {
		super(name);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(null, "设计模式真TM好使");
	}

}
