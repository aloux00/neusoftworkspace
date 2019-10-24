import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



public class MapTest {
public static void main(String[] args) {
	Map<String ,Object> map=new HashMap<>();
	map.put("ÐÕÃû", "Ë«Ï²°¡");
	Set<Entry<String, Object>> set = map.entrySet();

	 Iterator<Entry<String, Object>> iterator = set.iterator();
	while(iterator.hasNext()) {
		Entry<String, Object> next = iterator.next();
	System.out.println(next.getKey());
	System.out.println(next.getValue());
	}
	HashSet<String> ss=new HashSet<>();
	ss.add("mm");
	ss.add("ss");
	ss.add("xx");
	ArrayList<String > aa=new ArrayList<>();
	ss.forEach(System.out::println);

	Collections.sort(aa,new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	});
	
	
	
	
	
//	Iterator<String> iterator2 = ss.iterator();
//	while(iterator2.hasNext()) {
//
//	}
//   iterator2.next();
//		ss.remove("xx");
//		ss.add("haha");
//		iterator2.next();
//		ss.remove("ss");
//		iterator2.next();
//		ss.remove("mm");
	
	
	
	
	
}
}
