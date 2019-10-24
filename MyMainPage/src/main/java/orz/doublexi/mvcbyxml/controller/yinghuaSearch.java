package orz.doublexi.mvcbyxml.controller;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class yinghuaSearch extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
String s=request.getParameter("searchword");
//没办法，这个网站只认gbk
String t=URLEncoder.encode(s, "GBK");
	return new ModelAndView("redirect:http://www.imomoe.jp/search.asp?searchword="+t);
	}

}
