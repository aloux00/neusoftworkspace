package orz.doublexi.filter;

public class Main {

	public static void main(String[] args) {
		String msg="大家好，<script>,别就业被就业，((((((((((（（（（((((((((敏感";
		Request request=new Request();
		request.setRequestString(msg);
		Response response=new Response();
		response.setResponseString("response");
		FilterChain fc=new FilterChain();
		fc.addFilter(new HTMLFilter()).addFilter(new SesitiveFilter());
		fc.doFilter(request, response,fc);
		
		System.out.println(request.getRequestString());
		
		System.out.println(response.getResponseString());
	
	}
}
