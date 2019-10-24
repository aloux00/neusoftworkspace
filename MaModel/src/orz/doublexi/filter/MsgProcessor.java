package orz.doublexi.filter;

public class MsgProcessor {
	String msg;
FilterChain fc;	
	
public String process() {
	String r=msg;
	 return fc.doFilter(r);
	
	
}
public FilterChain getFc() {
	return fc;
}
public void setFc(FilterChain fc) {
	this.fc = fc;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}



}

