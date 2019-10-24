package filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.JOptionPane;

import sun.applet.AppletClassLoader;

public  class FileCP {

public static void main(String[] args) throws Exception {
	InputStream in=new FileInputStream("d:\\bb\\aa.txt");
	//in=AppletClassLoader.getSystemClassLoader().getResourceAsStream("cc.txt");
	//in=FileCP.class.getResourceAsStream("cc.txt");//���������Ŀ¼��ʼ��
	//in=FileCP.class.getClassLoader().getResourceAsStream("cc.txt");
	byte[] aa=new byte[100];
	FileCP pp=new FileCP();
  	in.read(aa);
	System.out.println(new String (aa));
	FileOutputStream out= new FileOutputStream("tt.txt");
	out.write(aa);
	out.flush();
	JOptionPane.showMessageDialog(null, "���Ƴɹ�����");
	out.close();
	in.close();
	
}
}
