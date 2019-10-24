package filecopy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class aa {
public static void main(String[] args) throws IOException {
	InputStream inputStream = ClassLoader.getSystemResourceAsStream("aa.properties");
	Properties aaa=new Properties();
	aaa.load(inputStream);
	Object object = aaa.get("url");
	System.out.println(object);
	
}
}
