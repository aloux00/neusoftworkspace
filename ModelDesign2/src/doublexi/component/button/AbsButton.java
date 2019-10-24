package doublexi.component.button;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class AbsButton extends JButton implements ActionListener{
public AbsButton(String name) {
super(name);
//setSize(name.length()*40, 20);
this.addActionListener(this);
}



}
