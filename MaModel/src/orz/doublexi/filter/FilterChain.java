package orz.doublexi.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain extends Filter{
	List<Filter> filters=new ArrayList<Filter>();
	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;
	}
	public String doFilter(String str) {
		for(Filter f:filters) {
			str=f.doFilter(str);
		}
		return str;
		
	}
	
}
