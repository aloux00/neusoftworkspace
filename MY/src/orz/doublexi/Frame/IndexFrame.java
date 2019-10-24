package orz.doublexi.Frame;

import javax.swing.*;


import orz.doublexi.service.FileStoreService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class IndexFrame extends JFrame implements MouseListener {
	 FileStoreService fs=new FileStoreService();
	 private Map source=null;

	public void setSource(Map<String, String> index) {
		this.source = index;
	}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			JLabel jj=(JLabel)e.getSource();
			String text = jj.getText();
			byte[] data = fs.queryData(text);
			System.out.println(text.split("\\.")[0]);
			System.out.println(text.split("\\.")[1]);
			if(text.split("\\.")[1].equals("jpg")){
				ShowFrame jf=new ShowFrame();
				jf.readyShowImage(data);
			
				
			}else{
				try {
					ShowFrame jf=new ShowFrame();
					jf.readyShowText();
					
					jf.getJt().setText(new String(data,"utf8"));
				
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}

