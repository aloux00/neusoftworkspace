package orz.doublexi.filter;

public class FaceFilter extends Filter {

	@Override
	String doFilter(String str) {
		return str.replace("(", "hehe");
	}

}
