import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Test;

public class TT03 {
@Test
public void test01() {
	SocketChannel channel=null;
	ByteBuffer buffer=null;
	FileChannel file=null;
	try {
		channel=SocketChannel.open();
		if(!(channel.connect(new InetSocketAddress("localhost",8888)))) {
			System.out.println("没连上，");
			return;
		}
		buffer= ByteBuffer.allocate(1024);
		file=FileChannel.open(Paths.get("src/test"), StandardOpenOption.READ);
		while(file.read(buffer)>0) {
			buffer.flip();
			channel.write(buffer);
			buffer.clear();
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(channel!=null) {
			try {
				channel.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if(file!=null) {
			try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
@Test
public void test02() {
	ServerSocketChannel channel =null;
	try {
		channel= ServerSocketChannel.open();
		channel.bind(new InetSocketAddress("localhost",8888));
		while(true) {
			SocketChannel accept =channel.accept();
			new Thread(()-> {
				ByteBuffer buffer=ByteBuffer.allocate(1024);
				while(true) {
					try {
						if(accept.read(buffer)>0) {
							buffer.flip();
							System.out.println(new String(buffer.array(),0,buffer.limit()));
							buffer.clear();
							
						}
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						//关闭资源
					}
				}
				
				
				
			}).start();
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

@Test
public void test03() throws Exception {
	FileOutputStream out=new FileOutputStream(new File("src/haha.txt"));

	out.close();
	
}
}
