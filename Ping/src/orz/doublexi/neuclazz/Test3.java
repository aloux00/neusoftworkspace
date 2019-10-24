package orz.doublexi.neuclazz;

public class Test3 {
	public static void main(String[] args) {
		System.out.println(convert(2));
	}
public static String convert(int n) {
	if(n<=1) {
	return String.valueOf(n);
	}
	return convert(n/2)+n%2;
}
}
