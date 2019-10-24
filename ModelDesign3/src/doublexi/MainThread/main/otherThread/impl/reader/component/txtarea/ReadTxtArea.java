package doublexi.MainThread.main.otherThread.impl.reader.component.txtarea;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import doublexi.component.txt.AbsTxtArea;
import doublexi.component.txt.AbsTxtLabel;

public class ReadTxtArea extends AbsTxtArea implements KeyListener{
	private String path;
	private char[] txt;
	private int page;
	public ReadTxtArea(Container con) {
super(con);
this.addKeyListener(this);
this.setLineWrap(true);
this.setEditable(false);
this.setFont(new Font("宋体",Font.PLAIN,40));
}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
//37
		
		if(e.getKeyCode()==37) {
			page--;
			if(page<0) {
				JOptionPane.showMessageDialog(null, "已经在开头了哦");
			}else {
				this.setText(new String(txt, page*255, 255));	
			}
		}else if(e.getKeyCode()==39) {
			page++;
			try {
				this.setText(new String(txt, page*255, 255));
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "后面就已经没有了");
			}
			
			
		}
		//39

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public char[] getTxt() {
		return txt;
	}

	public void setTxt(char[] txt) {
		this.txt = txt;
	}

	public void readFirstPage() {
		
		page=0;
	this.setText(new String(txt,page,255));	
	}
	
}
