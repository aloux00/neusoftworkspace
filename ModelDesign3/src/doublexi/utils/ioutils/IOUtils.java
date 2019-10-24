package doublexi.utils.ioutils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import jdk.internal.util.xml.impl.Input;

public class IOUtils {
	private static FileInputStream in;
	private static InputStreamReader reader;
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
		String name =null; 
	
//		new InputStreamReader(in).read;
		try {
			name=chooser.getSelectedFile().getAbsolutePath();
			
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
	
//		public static Map<String,Object> fromSelectFrameToChars() {
//			JFileChooser chooser = new JFileChooser(new File("D:"));
//			Map<String,Object> map;
//			chooser.showOpenDialog(null);
//			String name =null; 
//			String code =null; 
////			new InputStreamReader(in).read;
//			try {
//				name=chooser.getSelectedFile().getAbsolutePath();
//				code=getCodeStyle(name);
//				in = new FileInputStream(name);
//				reader=new InputStreamReader(in,code);
////				reader.read(target);
////				CharBuffer a;
////				char[] array = a.array();
//				CharBuffer.
//				int i = 0;
////				
////				while ((i = in.read(bytes)) > -1) {
////					arrout.write(bytes,0,i);
////				}
//				map=new HashMap<String ,Object>();
//				map.put("path", name);
//				map.put("txt", arrout.toByteArray());
//				return map;
//				//return arrout.toByteArray();
//			} catch (Exception e) {
//				JOptionPane.showMessageDialog(null, "什么情况？？文件获取失败了");
//				return null;
//			}finally {
//				if(in!=null) {
//					try {
//						in.close();
//						arrout.close();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//
//				}
//			}
//
//		}
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
	
	public static String getCodeStyle(String  path) throws Exception {
		InputStream in=new FileInputStream(path);
		byte[] head=new byte[3];
		in.read(head);
		String code="gb2312";
		if(head[0]==-1&&head[1]==-2) {
			code="UTF-16";
		}else if(head[0]==-2&&head[1]==-1) {
			code="Unicode";
		}else if(head[0]==-17&&head[1]==-69&&head[2]==-65) {
			code="UTF-8";
		}
		return code;
		
	}

}
