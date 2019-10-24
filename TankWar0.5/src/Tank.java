import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Tank {
	public static final int XSPEED=5;
	public static final int YSPEED=5;
private int x;
private int y;
private boolean bL=false;
private boolean bU=false;
private boolean bR=false;
private boolean bD=false;
enum Direction{L,LU,U,RU,R,RD,D,LD,STOP};
private Direction dir=Direction.STOP;
public Tank(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
void move() {
	switch(dir) {
	case L:x-=XSPEED;break;
	case LU:x-=XSPEED;y-=YSPEED;break;
	case RU:x+=XSPEED;y-=YSPEED;break;
	case R:x+=XSPEED;break;
	case RD:x+=XSPEED;y+=YSPEED;break;
	case D:y+=YSPEED;break;
	case LD:x-=XSPEED;y+=YSPEED;break;
	case STOP:x-=0;y+=0;break;
	}
}
void locateDirection() {
	if(bL&&!bU&&!bR&&!bD) dir=Direction.L;
	else if(bL&&bU&&!bR&&!bD) dir=Direction.LU;
	else if(!bL&&bU&&!bR&&!bD) dir=Direction.U;
	else if(!bL&&bU&&bR&&!bD) dir=Direction.RU;
	else if(!bL&&!bU&&bR&&!bD) dir=Direction.R;
	else if(!bL&&!bU&&bR&&bD) dir=Direction.RD;
	else if(!bL&&!bU&&!bR&&bD) dir=Direction.D;
	else if(bL&&!bU&&!bR&&bD) dir=Direction.LD;
	else if(!bL&&!bU&&!bR&&!bD) dir=Direction.STOP;
}
public void drow(Graphics g) {
Color c=g.getColor();
g.setColor(Color.red);
g.fillOval(x, y, 30, 30);
g.setColor(c);
move();
}
public void keyPressed(KeyEvent e) {
	int key=e.getKeyCode();
	switch(key) {
	case KeyEvent.VK_F:{
		
	   bR=true;
		break;
	}
	case KeyEvent.VK_S:{
		bL=true;
		break;
	}
	case KeyEvent.VK_E:{
		bU=true;
		break;
	}
	case KeyEvent.VK_D:{
		bD=true;
		break;
	}
	}
	locateDirection();
}
public void keyReleased(KeyEvent e) {
	int key=e.getKeyCode();
	switch(key) {
	case KeyEvent.VK_F:{
		
	   bR=false;
		break;
	}
	case KeyEvent.VK_S:{
		bL=false;
		break;
	}
	case KeyEvent.VK_E:{
		bU=false;
		break;
	}
	case KeyEvent.VK_D:{
		bD=false;
		break;
	}
	}
	locateDirection();
}
}
