import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

import org.junit.Test;

public class TT02 {
@Test
public void test02() throws IOException {
	long start=System.currentTimeMillis();
	FileChannel in=FileChannel.open(Paths.get("src/黎明之剑.txt"), StandardOpenOption.READ,StandardOpenOption.WRITE);
	FileChannel out = FileChannel.open(Paths.get("src/小说复制"), StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE);
	MappedByteBuffer inmap = in.map(MapMode.READ_WRITE, 0, in.size());
	
	MappedByteBuffer outmap = out.map(MapMode.READ_WRITE, 0, in.size());
	
	byte[] bytes=new byte[inmap.limit()];
	inmap.get(bytes);
	outmap.put(bytes);
	in.close();
	out.close();
	long end=System.currentTimeMillis();
	System.out.println("总耗时：+"+(end-start));

}
@Test
public void test03() throws IOException {
	FileChannel in=FileChannel.open(Paths.get("src/黎明之剑.txt"), StandardOpenOption.READ,StandardOpenOption.WRITE);
	FileChannel out = FileChannel.open(Paths.get("src/小说复制"), StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE);
	//in.transferTo(0, in.size(), out);
	out.transferFrom(in, 0, in.size());
	in.close();
out.close();	
}

@Test
public void test4() throws Exception {
	Path path=Paths.get("src/黎明之剑.txt");
	System.out.println(Files.exists(path));
	RandomAccessFile file=new RandomAccessFile(path.toFile(), "rw");
	
	FileChannel channel=file.getChannel();
    ByteBuffer buffer = ByteBuffer.allocate(1024);
    ByteBuffer buffer2 = ByteBuffer.allocate(4096);
    ByteBuffer[] buffers=new ByteBuffer[] {buffer,buffer2};
	channel.read(buffers);
	System.out.println(buffer.position());
	System.out.println(buffer2.position());
	byte[] bytes=new byte[5];
buffer2.clear();
buffer2.put("abcdefg".getBytes());
buffer2.flip();
	buffer2.get(bytes,0,5);
	System.out.println(new String(bytes));
	buffer2.flip();
	buffer2.clear();
	buffer2.put("abcdefg".getBytes());
	buffer2.flip();
	bytes=new byte[5];
	buffer2.get(bytes,1,4);
	System.out.println(new String(bytes));
	
}
@Test
public void test05() throws Exception {
	Charset cs=Charset.forName("GBK");
	CharsetEncoder encoder = cs.newEncoder();
	CharsetDecoder decoder = cs.newDecoder();
	CharBuffer buffer=CharBuffer.allocate(1024);
	buffer.put("孟双喜");
	buffer.flip();
	ByteBuffer encode = encoder.encode(buffer);
	for(int i=0;i<encode.limit();i++) {
	System.out.println(encode.get());
	}
	encode.rewind();
	
	CharBuffer decode = decoder.decode(encode);

	System.out.println(decode.toString());
	
	
}

@Test
public void test06() throws Exception {
	Socket socket=new Socket();
	socket.connect(new InetSocketAddress("localhost", 8888));
	OutputStream stream = socket.getOutputStream();
	Scanner scanner=new Scanner(System.in);
	while(true) {
		String line = scanner.nextLine();
		stream.write(line.getBytes());
	}
	
}
@Test
public void test07() throws IOException {
	ServerSocket server=new ServerSocket();
	server.bind(new InetSocketAddress("localhost", 8888));
	while(true) {
		Socket accept = server.accept();
		System.out.println("连接一个");
		new Thread(()->{
			try {
				InputStream stream = accept.getInputStream();
				byte[] bytes=new byte[1024];
				while(true) {
					if(stream.read(bytes)>0)
					System.out.println(new String(bytes));
				}
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start(); 
		
	}
}
}
