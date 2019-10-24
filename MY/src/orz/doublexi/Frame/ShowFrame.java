package orz.doublexi.Frame;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ShowFrame extends  JFrame{
	private JScrollPane jsp=new JScrollPane();
	private JTextArea jt=new JTextArea();
	private JLabel jl=new JLabel();
	public ShowFrame() {

}
	public void readyShowText(){

		jt.setLineWrap(true);
		this.add(jsp);
		jsp.setViewportView(jt);
		this.setBounds(0, 0, 1000, 1080);
		this.setVisible(true);
		
	}
	public void readyShowImage(byte[] data){
		this.add(jl);
		ImageIcon icon = new ImageIcon(data);
		this.setBounds(1, 1,icon.getIconWidth(), icon.getIconHeight());
		jl.setIcon(icon);
		this.setVisible(true);
		
	}
	public JTextArea getJt(){
		return jt;
	}
}