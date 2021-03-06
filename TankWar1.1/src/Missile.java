import java.awt.Color;
import java.awt.Graphics;

public class Missile {
    public  static final int XSPEED = 10;
	public  static final int YSPEED = 10;
	int x;
    int y;
    Tank.Direction dir;
	public Missile(int x, int y, Tank.Direction dir) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
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
		case RU:x+=XSPEED;y-=YSPEED;break;
		case R:x+=XSPEED;break;
		case RD:x+=XSPEED;y+=YSPEED;break;
		case D:y+=YSPEED;break;
		case LD:x-=XSPEED;y+=YSPEED;break;
		case STOP:break;
		}
	}
    
}
