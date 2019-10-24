import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class TT01 {
	//capacity:容量
	//limit：后边的数据不能读写
	//position:缓冲区中正在操作数据的位置
	@Test
	public void test01(){
		String str="she";
		ByteBuffer buf=ByteBuffer.allocate(1024);
		System.out.println(buf.capacity());
		System.out.println(buf.limit());
		System.out.println(buf.position());
		buf.put(str.getBytes());
		System.out.println(buf.capacity());
		System.out.println(buf.limit());
		System.out.println(buf.position());
		buf.flip();
		buf.flip();
		System.out.println(buf.capacity());
		System.out.println(buf.limit());
		System.out.println(buf.position());
		byte[] bytes=new byte[buf.limit()];
        buf.get(bytes);
        System.out.println(new String(bytes));
		System.out.println(buf.capacity());
		System.out.println(buf.limit());
		System.out.println(buf.position());
		buf.rewind();
		
	}
	@Test
	public void test02() {
		ByteBuffer buf=ByteBuffer.allocate(1024);
		System.out.println(buf.position());
		System.out.println(buf.limit());
		System.out.println(buf.capacity());
		System.out.println("#################s");
		buf.put("hello,world".getBytes());
		buf.flip();
		byte[] bytes=new byte[buf.limit()];
		 buf.get(bytes);
		 System.out.println(new String(bytes));
	}
	@Test
	public void test03() throws Exception {
		RandomAccessFile file=new RandomAccessFile("src/test", "rw");
		FileChannel channel = file.getChannel();
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		int read = channel.read(buffer);
		 read = channel.read(buffer);
		buffer.flip();
		System.out.print(buffer.limit());
		while(buffer.remaining()>0) {
System.out.print((char)buffer.get());	

		}System.out.println(read);
		
		
	}
	@Test
	public void test04() {
		ByteBuffer buffer=ByteBuffer.allocate(10);
		buffer.put("aacd".getBytes());
		ByteBuffer buffer2=ByteBuffer.allocate(10);
		buffer2.put("bacd".getBytes());
		buffer.flip();
		buffer2.flip();
		buffer.flip();
		buffer2.flip();
		System.out.println(buffer.equals(buffer2));
		Socket socket=new Socket();
		SocketChannel channel = socket.getChannel();
		Selector se;
		InputStream in;
		
	}
	@Test
	public void test05() throws Throwable{
		SocketChannel open = SocketChannel.open();
		open.connect(new InetSocketAddress("http://jenkov.com",80));
		while(!open.isConnected()) {
			System.out.println("还在连");
		}
		open.close();
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		open.read(buffer);
		buffer.flip();
		byte[] bytes=new byte[1024];
		buffer.get(bytes);
		System.out.println(new String(bytes));
		
	}
	@Test
	public void test06() throws IOException {
		Path path = Paths.get("src\\test");
		Path path2 = Paths.get("src\\tt\\test");
		Path move = Files.move(path,path2 , StandardCopyOption.REPLACE_EXISTING);
		System.out.println(move);
	}
	@Test
	public void test07() throws IOException {
		Files.walkFileTree(Paths.get("z:\\tt"),new SimpleFileVisitor<Path>() {

			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
				System.out.println("准备 "+dir.toString());
				return super.preVisitDirectory(dir, attrs);
			}

			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				System.out.println("文件 "+file.toString());
				return super.visitFile(file, attrs);
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				System.out.println("结束 "+dir.toString());
				return super.postVisitDirectory(dir, exc);
			}

		});
		
		
		AsynchronousFileChannel open = AsynchronousFileChannel.open(Paths.get(""),StandardOpenOption.READ);
	}
	@Test
	public void test08() {
		FileInputStream in2 = null;
		try {
			in2 = new FileInputStream("");
			FileInputStream in1=new FileInputStream("");
			FileInputStream in4=new FileInputStream("");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			int i=in2.available();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test09() throws Exception {
		FileInputStream in=new FileInputStream("src/test");
		FileOutputStream out=new FileOutputStream("src/22.txt");
		byte[] bytes=new byte[1024];
		in.read(bytes);
		out.write(bytes);
		System.out.println("OK");
		ByteBuffer bb;
	}
}
