import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;

public class TT05 {
@Test
public void send() throws Exception {
	DatagramChannel dc=DatagramChannel.open();
	dc.configureBlocking(false);
	ByteBuffer buf=ByteBuffer.allocate(1024);
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext()) {
		String str=scan.next();
		buf.put(str.getBytes());
		buf.flip();
		dc.send(buf, new InetSocketAddress("localhost",8888));
		buf.clear();
	}
}
@Test
public void receive() throws Exception {
	DatagramChannel channel=DatagramChannel.open();
	channel.configureBlocking(false);
	channel.bind(new InetSocketAddress("localhost",8888));
	Selector select=Selector.open();
	channel.register(select, SelectionKey.OP_READ);
	while(select.select()>0) {
		Set<SelectionKey> keys = select.keys();
		Iterator<SelectionKey> iterator = keys.iterator();
		while(iterator.hasNext()) {
			SelectionKey next = iterator.next();
			if(next.isReadable()) {
				ByteBuffer buffer=ByteBuffer.allocate(1024);
				channel.receive(buffer);
				buffer.flip();
				System.out.println(new String(buffer.array()));
			}
			iterator.remove();
		}
	}
}
}
