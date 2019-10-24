import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DT {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	System.out.println(sdf.format(new Date()));
	Date parse = sdf.parse("2019-03-03 3-3-3");
	Calendar cc=Calendar.getInstance();
	cc.setTime(parse);
	int year = cc.YEAR;
System.out.println(cc.get(1));
System.out.println(Integer.valueOf("11", 2));
System.out.println(Double.MAX_VALUE);
System.out.println(-3.0/0);
System.out.println("aaaab".indexOf("a"));
System.out.println("aaaab".indexOf("a"));
System.out.println("aaaab".indexOf("a"));
System.out.println("aaaab".indexOf("a", 4));
System.out.println("hhabicjiij".contains("ji"));
System.out.println(Math.pow(2, 32)/8/1000/1000);
System.out.println(Integer.MAX_VALUE/1000/1000*2);

}
}
