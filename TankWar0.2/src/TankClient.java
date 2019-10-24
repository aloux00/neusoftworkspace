import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class TankClient extends JFrame{
	public void launchFrame() {
	this.setLocation(400,200);
	this.setSize(800,600);
	this.setTitle("TankWar");
	this.addWindowListener(new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	});
	this.setResizable(false);
	this.setVisible(true);
	}
public static void main(String[] args) {
	TankClient tc=new TankClient();
	tc.launchFrame();
}
}
