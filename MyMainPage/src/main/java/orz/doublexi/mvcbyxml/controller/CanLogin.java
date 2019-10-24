package orz.doublexi.mvcbyxml.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import orz.doublexi.mvcbyxml.dao.AccountDao;
import orz.doublexi.mvcbyxml.projo.Account;

public class CanLogin extends AbstractController{
	SqlSession sqlsession;


	public SqlSession getSqlsession() {
		return sqlsession;
	}


	public void setSqlsession(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		AccountDao dao=sqlsession.getMapper(AccountDao.class);
		Account account = dao.queryAccount(username,password);
		if(account!=null) {
			request.getSession().setAttribute("loginuser", account.getUsername());
			return new ModelAndView("/WEB-INF/background/background.jsp");
		}
		request.setAttribute("msg", "账号或密码错误");
		return new ModelAndView("login.jsp");
		
	}

}
