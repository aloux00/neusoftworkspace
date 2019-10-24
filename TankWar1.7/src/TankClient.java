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

	
	List<Missile> missiles=new ArrayList();
	List<Explode> explodes=new ArrayList();
	List<Tank> tanks=new ArrayList();
	
	int x=50;
	int y=50;
	 Image offScreenImage;
	@Override
	public void paint(Graphics gp) {
		super.paint(gp);
		
		 if(offScreenImage==null){
			   offScreenImage=this.createImage(GAME_WIDTH, GAME_HEIGHT);
			  }
			  Graphics g= offScreenImage.getGraphics();
			  Color c=g.getColor();
			  g.setColor(this.getContentPane().getBackground());
			  g.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
			  g.setColor(c);
				 
		
		
		g.drawString("子弹数"+missiles.size(), 60, 60);
		g.drawString("爆炸数"+explodes.size(), 60, 80);
		g.drawString("敌人数"+tanks.size(), 60, 100);
		for(int i=0;i<missiles.size();i++) {
			Missile m=missiles.get(i);
			m.hitTanks(tanks);
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
		for(int i=0;i<tanks.size();i++) {
			Tank t=tanks.get(i);
			t.draw(g);
		}
		myTank.draw(g);
		 gp.drawImage(offScreenImage, 0, 0, null);//将缓冲区绘制好哦的图形整个绘制到容器的画布中
	}
	public void launchFrame() {
		for(int i=0;i<10;i++) {
			tanks.add(new Tank(50+30*(i+1), 50, false, this));
		}
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
				TimeUnit.MILLISECONDS.sleep(40);
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
