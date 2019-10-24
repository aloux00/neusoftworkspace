package orz.doublexi.filter;

public class SesitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response,FilterChain chain) {

		request.requestString=request.requestString.replace("被就业","就业").replace("敏感","");
		chain.doFilter(request, response, chain);
		response.responseString=response.responseString+this.getClass().toString();
	}


}
