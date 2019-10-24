import javax.swing.JFrame;

public class TankClient extends JFrame{
	public void launchFrame() {
	this.setLocation(400,200);
	this.setSize(800,600);
	this.setVisible(true);
	}
public static void main(String[] args) {
	TankClient tc=new TankClient();
	tc.launchFrame();
}
}
