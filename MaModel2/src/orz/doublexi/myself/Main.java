package orz.doublexi.myself;

public class Main {
public static void main(String[] args){
	String ss="大家好，你们都是敏感词<哈哈>";
	Request req=new Request();
	req.setmsg(ss);
	Response res=new Response();
	res.setMsg(ss);
	FilterChain chain=new FilterChain();
	chain.add(new BiaoDianFilter());
	chain.add(new MinGanCiFilter());
	chain.doFilter(req, res, chain);
System.out.println(req.getmsg());	
System.out.println(res.getMsg());

}

}
