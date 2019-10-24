import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SH {
public static void main(String[] args) throws CloneNotSupportedException {
	Set<Integer> set=new HashSet();
	while(set.size()<7) {
		set.add((int) (Math.random()*25+1));
	}
	Iterator<Integer> iterator = set.iterator();
	while(iterator.hasNext()) {
	
		System.out.println(iterator.next());
		
	}
	Object[] array = set.toArray();
for (Object object : array) {
	System.out.println(object);
}
for ( Integer i : set) {
	System.out.println(i);
}

Object clone = new tt().clone();


}


}
class tt implements Cloneable{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	private String name="sss";
	
}
