package com.neusoft.web.impl;


import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.impl.EmpServicesImpl;

import com.neusoft.web.support.ServletSupport;


@WebServlet("/addEmp.html")
public class AddEmpServlet extends ServletSupport 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			Map<String,Object> dto=this.createDto(request);
			EmpServicesImpl services=new EmpServicesImpl(dto);
			String msg=services.addEmp()?"导入成功":"导入失败";
			request.setAttribute("msg", msg);
		}
		catch (Exception e) 
		{
			request.setAttribute("msg", "网络错误");
			e.printStackTrace();
		}
		request.getRequestDispatcher("/addEmp.jsp").forward(request, response);
	}
}
