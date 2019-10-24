package com.neusoft.web.impl;


import com.neusoft.services.impl.EmpServicesImpl;
import com.neusoft.web.support.ServletSupport2;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delByIdEmp.html")
public class DelByIdEmpServlet extends ServletSupport2 {
	@Override
	protected String execute(Map<String, Object> dto, HttpServletRequest request) throws Exception {
	EmpServicesImpl services=new EmpServicesImpl(dto);
	String msg=services.deleteById()?"删除成功":"删除失败";
	request.setAttribute("msg", msg);
	List<Map<String,String>> rows=services.queryAll();
	if(rows.size()>0){
		request.setAttribute("rows", rows);
	}
		return "queryEmp";
	}

}
