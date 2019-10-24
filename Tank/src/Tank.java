import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Tank {
int x;
int y;
public Tank(int x,int y) {
this.x=x;
this.y=y;
}
public void draw(Graphics g) {
Color c=g.getColor();
g.setColor(Color.RED);
g.fillOval(x, y, 30, 30);
g.setColor(c);	
}
public void keyPressed(KeyEvent e) {
	int key=e.getKeyCode();
	switch(key) {
	case KeyEvent.VK_E:
		y-=5;
		break;
	case KeyEvent.VK_S:
		x-=5;
		break;
	case KeyEvent.VK_D:
		y+=5;
		break;
	case KeyEvent.VK_F:
		x+=5;
		break;
	}
}
}
