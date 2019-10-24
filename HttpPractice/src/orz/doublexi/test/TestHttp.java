package orz.doublexi.test;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestHttp {
public void test() throws Exception{
	CloseableHttpClient client = HttpClients.createDefault();
	HttpGet get=new HttpGet("http://www.bilibili.com");
	get.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; W…) Gecko/20100101 Firefox/68.0");
	CloseableHttpResponse execute = client.execute(get);
	HttpEntity entity = execute.getEntity();
	String string = EntityUtils.toString(entity,"utf-8");
	System.out.println(string);
	new FileOutputStream("D:\\page.html").write(string.getBytes());
	
}
public static void main(String[] args) {
	try {
		new TestHttp().test();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
