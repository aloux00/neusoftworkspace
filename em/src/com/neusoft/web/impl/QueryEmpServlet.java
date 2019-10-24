package com.neusoft.web.impl;


import com.neusoft.services.impl.EmpServicesImpl;
import com.neusoft.web.support.ServletSupport;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/queryEmp.html")
public class QueryEmpServlet extends ServletSupport {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		Map<String,Object> dto=this.createDto(request);
		EmpServicesImpl services=new EmpServicesImpl(dto);
		List<Map<String,String>> rows=services.queryAll();
		if(rows.size()>0){
			request.setAttribute("rows", rows);
		}
		else{
			request.setAttribute("msg", "没有符合条件的数据！！！");
		}
	} catch (Exception e) {
		request.setAttribute("msg", "网络错误");
		e.printStackTrace();
	}
	request.getRequestDispatcher("/queryEmp.jsp").forward(request, response);
	}

}
