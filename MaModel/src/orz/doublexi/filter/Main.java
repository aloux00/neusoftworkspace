package orz.doublexi.filter;

public class Main {

	public static void main(String[] args) {
		String msg="大家好，<script>,别就业被就业，((((((((((（（（（((((((((敏感";
		FilterChain fc=new FilterChain();
		fc.addFilter(new HTMLFilter()).addFilter(new SesitiveFilter());
		MsgProcessor map=new MsgProcessor();
		map.setFc(fc);
		map.setMsg(msg);
		String result=map.process();
		System.out.println(result);
	
	}
}
