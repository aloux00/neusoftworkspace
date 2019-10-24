package orz.doublexi.myself;

public class BiaoDianFilter implements Filter {

	@Override
	public void doFilter(Request req,Response res,FilterChain chain) {
	req.setmsg(req.getmsg().replaceAll("<", "[").replaceAll(">","]"));
		chain.doFilter(req, res, chain);
		res.setMsg(res.getMsg()+"哈哈哈");
	}

}
