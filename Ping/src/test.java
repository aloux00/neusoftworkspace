import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	@Deprecated
public static void main(String[] args) throws IOException {
	System.out.println(PP23.i);
	int a=PP23.i;
	FileWriter writer=new FileWriter("",false);
	ExecutorService pool = Executors.newFixedThreadPool(10);
	
}
}
