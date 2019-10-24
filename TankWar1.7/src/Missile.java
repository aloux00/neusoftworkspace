import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.List;

public class Missile {
    public  static final int XSPEED = 10;
	public  static final int YSPEED = 10;
	public static final int WIDTH=10;
	public static final int HEIGHT=10;
	int x;
    int y;
    Tank.Direction dir;
    TankClient tc;
    private boolean Live=true;
	public boolean isLive() {
		return Live;
	}
	public Missile(int x, int y, Tank.Direction dir, TankClient tc) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.tc=tc;
	}
    public void draw(Graphics g) {
        Color c=g.getColor();
        g.setColor(Color.black);
        g.fillOval(x, y, 10, 10);
        g.setColor(c);
        move();
    }
	private void move() {
		// TODO Auto-generated method stub
		switch(dir) {
		case L:x-=XSPEED;break;
		case LU:x-=XSPEED;y-=YSPEED;break;
		case U:y-=YSPEED;break;
		case RU:x+=XSPEED;y-=YSPEED;break;
		case R:x+=XSPEED;break;
		case RD:x+=XSPEED;y+=YSPEED;break;
		case D:y+=YSPEED;break;
		case LD:x-=XSPEED;y+=YSPEED;break;
		case STOP:break;
		}
		
	
		if(x<0||y<0||x>TankClient.GAME_WIDTH||y>TankClient.GAME_HEIGHT) {
			Live=false;
			tc.missiles.remove(this);
		}
	}
	
	public Rectangle getRect() {
		return new Rectangle(x,y,WIDTH,HEIGHT);
	}
	public boolean hitTank(Tank t) {
		if(this.getRect().intersects(t.getRect())&&t.isLive()) {
			t.setLive(false);
			tc.tanks.remove(t);
			this.Live=false;
			tc.explodes.add(new Explode(x, y, tc));
			return true;
		}
		return false;
	}
	public boolean hitTanks(List<Tank> tanks) {
		for(int i=0;i<tanks.size();i++) {
			if(hitTank(tanks.get(i))) {
				return true;
			}
		}
	return false;
	}
    
}
