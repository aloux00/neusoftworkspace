package doublexi.MainThread.main.otherThread.impl.notpad.ioutils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class IOUtils {
	private static FileInputStream in;
	private static FileOutputStream out;
	private static ByteArrayOutputStream arrout;

	/**
	 * 弹出文件选择框，选择文件后返回字节数组
	 * 
	 * @return
	 */
	public static Map<String,Object> fromSelectFrameToBytes() {
		JFileChooser chooser = new JFileChooser(new File("D:"));
		Map<String,Object> map;
		chooser.showOpenDialog(null);
		String name = chooser.getSelectedFile().getAbsolutePath();
		try {
			in = new FileInputStream(name);
			arrout = new ByteArrayOutputStream();
			byte[] bytes = new byte[2048];
			int i = 0;
			while ((i = in.read(bytes)) > -1) {
				arrout.write(bytes,0,i);
			}
			map=new HashMap<String ,Object>();
			map.put("path", name);
			map.put("txt", arrout.toByteArray());
			return map;
			//return arrout.toByteArray();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "什么情况？？文件获取失败了");
			return null;
		}finally {
			if(in!=null) {
				try {
					in.close();
					arrout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}
	public static boolean saveStringByPath(String path,String txt) {
		try {
			File file=new File(path);
			if(!file.exists()) {
				file.getParentFile().mkdirs();
				System.out.println(file.getParentFile().getAbsolutePath());
				boolean flag=file.createNewFile();
			}
			
			out=new FileOutputStream(file);
			out.write(txt.getBytes());
			out.flush();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "保存出现了意外，盲猜没导入就保存");
			return false;
		}finally {
			if(out!=null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
		
		
		
	}

}
