package basic;

public class NPETest {

	public static void main(String[] args)
	{
	    String str=null;
	    int len=str.length();
	    System.out.println(len);
	}

}
