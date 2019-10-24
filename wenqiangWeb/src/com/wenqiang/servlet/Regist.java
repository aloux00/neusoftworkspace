package com.wenqiang.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wenqiang.dao.AccountDao;
import com.wenqiang.model.Account;

@WebServlet("/regist")
public class Regist extends HttpServlet {
    AccountDao dao=new AccountDao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String access=request.getParameter("access");
		if(access==null) {
			access="1";
		}
		Account account=new Account();
		account.setUsername(username);
		account.setPassword(password);
		account.setAccess(Integer.parseInt(access));
		int i = dao.insertAccount(account);
		if(i>0) {
			request.setAttribute("msg", "注册成功");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
		}else{
			request.setAttribute("msg", "注册失败");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
