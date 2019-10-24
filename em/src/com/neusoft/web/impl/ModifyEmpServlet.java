package com.neusoft.web.impl;


import com.neusoft.services.impl.EmpServicesImpl;
import com.neusoft.web.support.ServletSupport2;
import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/modifyEmp.html")
public class ModifyEmpServlet extends ServletSupport2 {

	@Override
	protected String execute(Map<String, Object> dto, HttpServletRequest request) throws Exception {
		EmpServicesImpl services=new EmpServicesImpl(dto);
		String msg=services.modifyEmp()?"修改成功":"修改失败";
		request.setAttribute("msg", msg);
		return "addEmp";
	}
	
}
