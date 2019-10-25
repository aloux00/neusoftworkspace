package orz.doublexi.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Properties;

public class Utils {
private Utils() {}
public static Properties getProperties() {
	InputStream stream = null;
	try {
		stream = new FileInputStream("Data/data.properties");
		Properties pro=new Properties();
		pro.load(stream);
		return pro;
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	return null;
	
	
}
public static void storeProperties(Properties prop,String path){
	OutputStream out=null;
	try {
		out=new FileOutputStream(path);
		prop.store(out, new Date().toString());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
