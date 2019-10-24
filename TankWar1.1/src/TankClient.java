import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class TankClient extends JFrame {
	public static final int GAME_WIDTH=800;
	public static final int GAME_HEIGHT=600;
	Tank myTank=new Tank(50, 50);
	Missile m=new Missile(50, 50, Tank.Direction.R);
	int x=50;
	int y=50;
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		m.draw(g);
		myTank.draw(g);
	}
	public void launchFrame() {
	this.setLocation(400,200);
	this.setSize(GAME_WIDTH,GAME_HEIGHT);
	this.setTitle("TankWar");
	this.getContentPane().setBackground(Color.green);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setResizable(false);
	this.addKeyListener(new KeyMonitor());
	this.setVisible(true);
	new Thread(()->{
		while(true) {
			repaint();
			try {
				TimeUnit.MILLISECONDS.sleep(50);
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

private class KeyMonitor extends KeyAdapter {

	@Override
	public void keyPressed(KeyEvent e) {
      myTank.keyPressed(e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		myTank.keyReleased(e);
	}
	

}
}
