import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class TankClient extends JFrame{
	int x=50;
	int y=50;
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Color c=g.getColor();
		g.setColor(Color.RED);
		g.fillOval(x, y, 30, 30);
		g.setColor(c);
		y++;
		
		
	}
	public void launchFrame() {
	this.setLocation(400,200);
	this.setSize(800,600);
	this.setTitle("TankWar");
	this.getContentPane().setBackground(Color.green);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setVisible(true);
	new Thread(()->{
		while(true) {
			repaint();
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}).start();
	}
public static void main(String[] args) {
	TankClient tc=new TankClient();
	tc.launchFrame();
}


}
