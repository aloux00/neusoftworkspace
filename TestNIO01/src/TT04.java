import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Scanner;

import org.junit.Test;

public class TT04 {
@Test
public void client() throws Exception {
	SocketChannel schannel=SocketChannel.open(new InetSocketAddress("localhost", 8888));
	schannel.configureBlocking(false);
	
	ByteBuffer buf=ByteBuffer.allocate(1024);
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext()) {
		String str=scan.next();
		buf.put(str.getBytes());
		buf.flip();
		schannel.write(buf);
		buf.clear();
	}
	
	

}
@Test
public void server() throws Exception {
	ServerSocketChannel serverChannel = ServerSocketChannel.open();
	serverChannel.configureBlocking(false);
	serverChannel.bind(new InetSocketAddress("localhost", 8888));
	Selector selector = Selector.open();
	serverChannel.register(selector, SelectionKey.OP_ACCEPT);
	while(selector.select()>0) {
		Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
		while(iterator.hasNext()) {
			SelectionKey next = iterator.next();
			if(next.isAcceptable()) {
				SocketChannel channel=serverChannel.accept();
				channel.configureBlocking(false);
				channel.register(selector, SelectionKey.OP_READ);
			}else if(next.isReadable()) {
				SocketChannel channel = (SocketChannel)next.channel();
				ByteBuffer buffer = ByteBuffer.allocate(1024);
				while(channel.read(buffer)>0) {
					buffer.flip();
					System.out.print(new String(buffer.array(),0,buffer.limit()));
					buffer.clear();
				}
				
				
			}
			iterator.remove();
		}
	}
}
}
