package com.wenqiang.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wenqiang.dao.AccountDao;
import com.wenqiang.model.Account;

@WebServlet("/login")
public class Login extends HttpServlet {
       AccountDao dao=new AccountDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Account account = dao.queryAccount(username, password);
		if(account!=null) {
			request.getSession().setAttribute("username", account.getUsername());
			request.getRequestDispatcher("background.jsp").forward(request, response);
		}
		else {
			request.setAttribute("msg", "账号或密码错误");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
