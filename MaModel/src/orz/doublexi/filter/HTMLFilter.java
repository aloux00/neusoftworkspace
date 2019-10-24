package orz.doublexi.filter;

public class HTMLFilter extends Filter {

	@Override
	String doFilter(String str) {
		String r=str.replace('<', '[').replace('>', ']');
		r=r.replace("被就业", "就业");
		r=r.replace("敏感", "");

		return r;
		
	}

}
