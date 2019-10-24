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
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class TankClient extends JFrame {
	public static final int GAME_WIDTH=800;
	public static final int GAME_HEIGHT=600;
	Tank myTank=new Tank(50, 50,true,this);
	Tank enemyTank=new Tank(100,100,false,this);
	
	List<Missile> missiles=new ArrayList();
	List<Explode> explodes=new ArrayList();
	int x=50;
	int y=50;
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("子弹数"+missiles.size(), 60, 60);
		g.drawString("爆炸数"+explodes.size(), 60, 80);
		for(int i=0;i<missiles.size();i++) {
			Missile m=missiles.get(i);
			m.hitTank(enemyTank);
			if(m.isLive()) {
				m.draw(g);
			}else {
				missiles.remove(m);
			}
		}
		for(int i=0;i<explodes.size();i++) {
			Explode e=explodes.get(i);
			e.draw(g);
		}
		myTank.draw(g);
		enemyTank.draw(g);
		
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
