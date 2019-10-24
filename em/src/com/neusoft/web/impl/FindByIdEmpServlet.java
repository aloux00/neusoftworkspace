package com.neusoft.web.impl;


import com.neusoft.services.impl.EmpServicesImpl;
import com.neusoft.web.support.ServletSupport;
import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/findByIdEmp.html")
public class FindByIdEmpServlet extends ServletSupport {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		Map<String,Object> dto=this.createDto(request);
		EmpServicesImpl services=new EmpServicesImpl(dto);
		Map<String,String> ins=services.findById();
	    if(ins!=null){
	    	request.setAttribute("ins", ins);
	    }else{
	    	request.setAttribute("msg", "该数据已删除或禁止访问");
	    	
	    }
	} catch (Exception e) {
		request.setAttribute("msg", "网络故障");
	}	
	request.getRequestDispatcher("/addEmp.jsp").forward(request, response);
	}
}
