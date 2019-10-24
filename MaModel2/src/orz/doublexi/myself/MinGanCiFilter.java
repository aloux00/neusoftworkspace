package orz.doublexi.myself;

public class MinGanCiFilter implements Filter {

	@Override
	public void doFilter(Request req,Response res,FilterChain chain) {
		req.setmsg(req.getmsg().replaceAll("敏感词", "**"));
		chain.doFilter(req, res, chain);
		res.setMsg("hehe");
		
	}

}
