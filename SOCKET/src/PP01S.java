import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
@SuppressWarnings("unused")
public class PP01S {
public static void main(String[] args)  throws Exception{
	ServerSocket server=new ServerSocket();
	server.bind(new InetSocketAddress("127.0.0.1",8888));
	while(true) {
	Socket accept = server.accept();
	new Thread(()->{
		try {
			handle(accept);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}).start();;
	}
}

public static void handle(Socket s) throws Exception {
	byte[] bytes=new byte[1024];
	int read = s.getInputStream().read(bytes);
	System.out.println(new String(bytes,0,read));
	s.getOutputStream().write("服务器收到了".getBytes());
	s.getOutputStream().flush();
	System.out.println(s.getPort());
}
}
