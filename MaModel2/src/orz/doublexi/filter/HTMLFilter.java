package orz.doublexi.filter;

public class HTMLFilter implements Filter {

	@Override
	public void doFilter(Request request,Response response ,FilterChain chain) {
request.requestString=request.requestString.replace('<', '[').replace('>', ']');
chain.doFilter(request, response, chain);		
response.responseString=response.responseString+this.getClass().toString();


	}

}
