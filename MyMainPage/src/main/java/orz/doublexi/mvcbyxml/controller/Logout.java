package orz.doublexi.mvcbyxml.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import orz.doublexi.mvcbyxml.dao.AccountDao;
import orz.doublexi.mvcbyxml.projo.Account;

public class Logout extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	request.getSession().removeAttribute("loginuser");
		return new ModelAndView("main.jsp");
		
	}

}
