package orz.doublexi.neuclazz;

public class Test {
	public static void main(String[] args) {
		String reverse = reverse("abcdefg");
		System.out.println(reverse);
	}
	public static String reverse(String str) {
		if(str.length()==1) {
			return str;
		}else{
			return str.substring(str.length()-1)+reverse(str.substring(0,str.length()-1));
		}
	}
}
