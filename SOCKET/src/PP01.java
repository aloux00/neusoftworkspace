import java.net.Socket;

public class PP01 {
public static void main(String[] args) throws Exception {
	Socket s=new Socket("127.0.0.1",8888);
	s.getOutputStream().write("你好".getBytes());
	s.getOutputStream().flush();
	System.out.println("ClientWaiting");
	byte[] bytes=new byte[1024];
	int len=s.getInputStream().read(bytes);
	System.out.println(new String(bytes));
	s.close();
}
}
