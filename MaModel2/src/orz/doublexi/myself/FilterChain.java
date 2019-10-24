package orz.doublexi.myself;

import java.util.ArrayList;

public class FilterChain implements Filter{
	ArrayList<Filter> filters=new ArrayList();
	int index=-1;
	public void add(Filter filter) {
		filters.add(filter);
	}
	@Override
	public void doFilter(Request req,Response res ,FilterChain chain) {
		index++;
		if(index>(filters.size()-1)) {
			return;
		}
		filters.get(index).doFilter(req, res,chain);
		
	}
}
