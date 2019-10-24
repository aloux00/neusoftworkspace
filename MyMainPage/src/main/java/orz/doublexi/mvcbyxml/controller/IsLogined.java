package orz.doublexi.mvcbyxml.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class IsLogined extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if(request.getSession().getAttribute("loginuser")!=null) {
			return new ModelAndView("/WEB-INF/background/background.jsp");
		}
		return new ModelAndView("login.jsp");
	}

}
